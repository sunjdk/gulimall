package com.example.gulimall.coupon.dao;

import com.example.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author 盛茂国
 * @email 1620016116@qq.com
 * @date 2023-11-27 01:42:26
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
