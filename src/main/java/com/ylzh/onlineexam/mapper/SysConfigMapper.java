package com.ylzh.onlineexam.mapper;

import com.ylzh.onlineexam.entity.SysConfig;
import java.util.List;

public interface SysConfigMapper {
    int insert(SysConfig record);

    List<SysConfig> selectAll();
}