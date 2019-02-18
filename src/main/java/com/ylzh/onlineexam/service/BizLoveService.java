package com.ylzh.onlineexam.service;

import com.ylzh.onlineexam.entity.BizLove;

public interface BizLoveService extends BaseService<BizLove> {
    BizLove checkLove(Integer bizId,String userIp);
}
