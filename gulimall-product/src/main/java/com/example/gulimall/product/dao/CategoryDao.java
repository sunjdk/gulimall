package com.example.gulimall.product.dao;

import com.example.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author 盛茂国
 * @email 1620016116@qq.com
 * @date 2023-11-26 17:04:58
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
