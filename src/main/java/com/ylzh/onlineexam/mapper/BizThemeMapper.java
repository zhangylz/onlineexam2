package com.ylzh.onlineexam.mapper;
import com.ylzh.onlineexam.util.MapperUtil;
import com.ylzh.onlineexam.entity.BizTheme;


public interface BizThemeMapper extends MapperUtil<BizTheme> {

    int setInvaid();
    int updateStatusById(Integer id);
    int deleteBatch(Integer[] ids);
}