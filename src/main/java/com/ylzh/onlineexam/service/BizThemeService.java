package com.ylzh.onlineexam.service;

import com.ylzh.onlineexam.entity.BizTheme;

public interface BizThemeService  extends BaseService<BizTheme>  {
    int useTheme(Integer id);

    BizTheme selectCurrent();

    int deleteBatch(Integer[]ids);

}
