package com.ylzh.onlineexam.service;

import java.util.Map;

public interface SysConfigService {

    Map<String,String> selectAll();

    int updateByKey(String key,String value);
}
