package com.example.gulimall.member.dao;

import com.example.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author 盛茂国
 * @email 1620016116@qq.com
 * @date 2023-11-27 01:56:44
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
