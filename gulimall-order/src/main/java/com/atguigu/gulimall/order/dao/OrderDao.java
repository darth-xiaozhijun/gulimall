package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author geekshow
 * @email geekshow@gmail.com
 * @date 2020-07-09 23:49:43
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
