package com.xiaoming.gulimall.order.dao;

import com.xiaoming.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xiaoming
 * @email shixiaomingye@gmail.com
 * @date 2020-04-02 14:46:01
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
