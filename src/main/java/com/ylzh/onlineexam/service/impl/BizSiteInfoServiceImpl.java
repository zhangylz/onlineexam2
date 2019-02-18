package com.ylzh.onlineexam.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ylzh.onlineexam.mapper.BizArticleMapper;
import com.ylzh.onlineexam.service.BizSiteInfoService;

@Service
public class BizSiteInfoServiceImpl implements BizSiteInfoService {
    @Autowired
    private BizArticleMapper bizArticleMapper;

    @Override
    public Map<String, Object> getSiteInfo() {
        Map<String, Object> map = bizArticleMapper.getSiteInfo();
        return map;
    }

}
