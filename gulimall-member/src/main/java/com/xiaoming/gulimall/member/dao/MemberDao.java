package com.xiaoming.gulimall.member.dao;

import com.xiaoming.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xiaoming
 * @email shixiaomingye@gmail.com
 * @date 2020-04-02 15:55:54
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
