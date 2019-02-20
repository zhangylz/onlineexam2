package com.ylzh.onlineexam.mapper;

import com.ylzh.onlineexam.entity.BizLove;
import org.apache.ibatis.annotations.Param;
import com.ylzh.onlineexam.util.MapperUtil;
import java.util.List;

public interface BizLoveMapper extends MapperUtil<BizLove>  {

    BizLove checkLove(@Param("bizId")Integer bizId, @Param("userIp")String userIp);
}