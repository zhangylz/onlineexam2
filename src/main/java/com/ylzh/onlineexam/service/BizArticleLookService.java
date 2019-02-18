package com.ylzh.onlineexam.service;

import java.util.Date;

import com.ylzh.onlineexam.entity.BizArticleLook;

public interface BizArticleLookService extends BaseService<BizArticleLook> {
    int checkArticleLook( Integer articleId, String userIp, Date lookTime);
}
