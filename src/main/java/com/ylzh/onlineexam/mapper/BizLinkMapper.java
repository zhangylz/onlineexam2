package com.ylzh.onlineexam.mapper;

import com.ylzh.onlineexam.entity.BizLink;
import com.ylzh.onlineexam.util.MapperUtil;
import java.util.List;

public interface BizLinkMapper extends MapperUtil<BizLink> {


    List<BizLink> selectLinks(BizLink bizLink);

    int deleteBatch(Integer[] ids);
}