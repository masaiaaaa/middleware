package com.debug.middleware.server.service;


import com.debug.middleware.server.dto.RedPacketDto;

import java.math.BigDecimal;
import java.util.List;

/**
 * 红包业务逻辄处理过程数据记录接口， 异步实现
 * @author: zhonglinsen
 * @date: 2019/3/18
 */
public interface IRedService {
    //记录发红包时红包的全局唯一标识串、 随机金额列表和红包个数等信息入数据库
    void recordRedPacket(RedPacketDto dto, String redId, List<Integer> list) throws Exception;
    //记录抢红包时用户抢到的红包全额等信息入数据库
    void recordRobRedPacket(Integer userId, String redId, BigDecimal amount) throws Exception;

}
