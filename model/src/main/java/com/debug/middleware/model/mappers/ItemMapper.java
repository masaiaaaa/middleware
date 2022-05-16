package com.debug.middleware.model.mappers;

import com.debug.middleware.model.entity.Item;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface ItemMapper {
    //此为MyBatis逆向工程自动生成的方法－增删改查
    int deleteByPrimaryKey(Integer id);

    int insert(Item record);

    int insertSelective(Item record);

    Item selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);
    //根据商品编码查询商品详情
    Item selectByCode(@Param("code") String code);
}