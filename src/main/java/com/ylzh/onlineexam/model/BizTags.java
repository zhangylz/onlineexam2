package com.ylzh.onlineexam.model;

import com.ylzh.onlineexam.vo.base.BaseVO;


public class BizTags extends BaseVO {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
