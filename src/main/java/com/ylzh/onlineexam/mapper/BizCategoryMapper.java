package com.ylzh.onlineexam.mapper;

import com.ylzh.onlineexam.entity.BizCategory;
import com.ylzh.onlineexam.util.MapperUtil;
import java.util.List;

public interface BizCategoryMapper extends MapperUtil<BizCategory> {

    List<BizCategory> selectCategories(BizCategory bizCategory);

    int deleteBatch(Integer[] ids);

    BizCategory selectById(Integer id);
}