package com.ylzh.onlineexam.model;

import com.ylzh.onlineexam.vo.base.BaseVO;


public class BizArticleTags extends BaseVO {
	
    private Integer tagId;
    private Integer articleId;

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }
}
