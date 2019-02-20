package com.ylzh.onlineexam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ylzh.onlineexam.annotation.RedisCache;
import com.ylzh.onlineexam.mapper.BizThemeMapper;
import com.ylzh.onlineexam.entity.BizTheme;
import com.ylzh.onlineexam.service.BizThemeService;
import com.ylzh.onlineexam.util.CoreConst;

@Service
public class BizThemeServiceImpl extends BaseServiceImpl<BizTheme> implements BizThemeService {

    @Autowired
    private BizThemeMapper themeMapper;
    @Override
    @RedisCache(flush = true)
    public int useTheme(Integer id) {
        themeMapper.setInvaid();
        return themeMapper.updateStatusById(id);
    }

    @Override
    @RedisCache
    public BizTheme selectCurrent() {
        BizTheme bizTheme = new BizTheme();
        bizTheme.setStatus(CoreConst.STATUS_VALID);
        return themeMapper.selectOne(bizTheme);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        return themeMapper.deleteBatch(ids);
    }
}
