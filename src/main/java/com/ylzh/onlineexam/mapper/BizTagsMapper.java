package com.ylzh.onlineexam.mapper;
import com.ylzh.onlineexam.util.MapperUtil;
import com.ylzh.onlineexam.entity.BizTags;

import java.util.List;

public interface BizTagsMapper extends MapperUtil<BizTags> {

    List<BizTags> selectTags(BizTags bizTags);

    int deleteBatch(Integer[] ids);
}