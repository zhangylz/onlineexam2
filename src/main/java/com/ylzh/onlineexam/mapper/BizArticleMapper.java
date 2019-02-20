package com.ylzh.onlineexam.mapper;

import com.ylzh.onlineexam.entity.BizArticle;
import com.ylzh.onlineexam.vo.ArticleConditionVO;
import com.ylzh.onlineexam.util.MapperUtil;
import java.util.List;
import java.util.Map;

public interface BizArticleMapper extends MapperUtil<BizArticle> {


    /**
     * 分页查询，关联查询文章标签、文章类型
     *
     * @param vo
     * @return
     */
    List<BizArticle> findByCondition(ArticleConditionVO vo);

    /**
     * 统计指定文章的标签集合
     *
     * @param list
     * @return
     */
    List<BizArticle> listTagsByArticleId(List<Integer> list);

    /**
     * 热门文章
     *
     * @return
     */
    List<BizArticle> hotList();

    /**
     * 获取文章详情，文章标签、文章类型
     *
     * @param id
     * @return
     */
    BizArticle selectById(Integer id);

    /**
     * 批量删除文章
     * @param ids
     * @return
     */
    int deleteBatch(Integer[]ids);

    /**
     * 统计网站信息
     * @return
     */
    Map<String, Object> getSiteInfo();
}