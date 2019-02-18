package com.ylzh.onlineexam.service;

import java.util.List;

import com.ylzh.onlineexam.entity.BizLink;

public interface BizLinkService extends BaseService<BizLink> {
    List<BizLink> selectLinks(BizLink bizLink);

    int deleteBatch(Integer[]ids);

}
