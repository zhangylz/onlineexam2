package com.ylzh.onlineexam.service;

import java.util.List;

import com.ylzh.onlineexam.entity.BizTags;

public interface BizTagsService extends BaseService<BizTags>{
    List<BizTags> selectTags(BizTags bizTags);

    int deleteBatch(Integer[]ids);
}
