package com.ylzh.onlineexam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ylzh.onlineexam.mapper.BizCategoryMapper;
import com.ylzh.onlineexam.entity.BizCategory;
import com.ylzh.onlineexam.service.BizCategoryService;

@Service
public class BizCategoryServiceImpl extends BaseServiceImpl<BizCategory> implements BizCategoryService {
    @Autowired
    private BizCategoryMapper bizCategoryMapper;
    @Override
    public List<BizCategory> selectCategories(BizCategory bizCategory) {
        return bizCategoryMapper.selectCategories(bizCategory);
    }
    @Override
    public int deleteBatch(Integer[] ids) {
        return bizCategoryMapper.deleteBatch(ids);
    }

    @Override
    public BizCategory selectById(Integer id) {
        return bizCategoryMapper.selectById(id);
    }

    @Override
    public List<BizCategory> selectByPid(Integer pid) {
        BizCategory bizCategory = new BizCategory();
        bizCategory.setPid(pid);
        return bizCategoryMapper.select(bizCategory);
    }
}
