package com.ylzh.onlineexam.aspect;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ylzh.onlineexam.annotation.RedisCache;
import com.ylzh.onlineexam.service.RedisService;
import com.ylzh.onlineexam.util.AspectUtil;

@Aspect
@Component
public class RedisCacheAspect {
    private static Logger logger = LoggerFactory.getLogger(RedisCacheAspect.class);

    private static final String CACHE_PREFIX = "exam_";

    @Autowired
    private RedisService redisService;

    @Pointcut(value = "@annotation(com.ylzh.onlineexam.annotation.RedisCache)")
    public void pointcut() {
    }

    @Around("pointcut()")
    public Object handle(ProceedingJoinPoint point) throws Throwable {
        Method currentMethod = AspectUtil.getMethod(point);
        //获取操作名称
        RedisCache cache = currentMethod.getAnnotation(RedisCache.class);
        boolean flush = cache.flush();
        if (flush) {
            String classPrefix = AspectUtil.getKeyOfClassPrefix(point, CACHE_PREFIX);
            logger.info("清空缓存 - {}*", classPrefix);
            redisService.delBatch(classPrefix);
            return point.proceed();
        }
        String key = AspectUtil.getKey(point, cache.key(), CACHE_PREFIX);
        boolean hasKey = redisService.hasKey(key);
        if (hasKey) {
            try {
                logger.info("{}从缓存中获取数据", key);
                return redisService.get(key);
            } catch (Exception e) {
                logger.error("从缓存中获取数据失败！", e);
            }
        }
        //先执行业务
        Object result = point.proceed();
        redisService.set(key, result, cache.expire(), cache.unit());
        logger.info("{}从数据库中获取数据", key);
        return result;
    }
}
