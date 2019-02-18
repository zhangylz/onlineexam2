package com.ylzh.onlineexam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ylzh.onlineexam.mapper.BizTagsMapper;
import com.ylzh.onlineexam.entity.BizTags;
import com.ylzh.onlineexam.service.BizTagsService;

@Service
public class BizTagsServiceImpl extends BaseServiceImpl<BizTags> implements BizTagsService {

    @Autowired
    private BizTagsMapper bizTagsMapper;

    @Override
    public List<BizTags> selectTags(BizTags bizTags) {
        return bizTagsMapper.selectTags(bizTags);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        return bizTagsMapper.deleteBatch(ids);
    }
}
