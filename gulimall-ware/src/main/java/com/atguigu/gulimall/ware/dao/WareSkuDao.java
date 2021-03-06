package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author geekshow
 * @email geekshow@gmail.com
 * @date 2020-07-09 23:52:23
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
