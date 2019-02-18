package com.ylzh.onlineexam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ylzh.onlineexam.mapper.BizLoveMapper;
import com.ylzh.onlineexam.entity.BizLove;
import com.ylzh.onlineexam.service.BizLoveService;

@Service
public class BizLoveServiceImpl extends BaseServiceImpl<BizLove> implements BizLoveService {
    @Autowired
    private BizLoveMapper loveMapper;
    @Override
    public BizLove checkLove(Integer bizId, String userIp) {
        return loveMapper.checkLove(bizId,userIp);
    }
}
