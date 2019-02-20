package com.ylzh.onlineexam.mapper;
import com.ylzh.onlineexam.entity.BizArticleLook;
import com.ylzh.onlineexam.util.MapperUtil;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface BizArticleLookMapper extends MapperUtil<BizArticleLook> {

    int checkArticleLook(@Param("articleId") Integer articleId, @Param("userIp") String userIp, @Param("lookTime") Date lookTime);
}