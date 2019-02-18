package com.ylzh.onlineexam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ylzh.onlineexam.mapper.BizLinkMapper;
import com.ylzh.onlineexam.entity.BizLink;
import com.ylzh.onlineexam.service.BizLinkService;

@Service
public class BizLinkServiceImpl extends BaseServiceImpl<BizLink> implements BizLinkService  {
    @Autowired
    private BizLinkMapper linkMapper;
    @Override
    public List<BizLink>  selectLinks(BizLink bizLink) {
        return linkMapper.selectLinks(bizLink);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        return linkMapper.deleteBatch(ids);
    }

}
