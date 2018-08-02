package com.stockcommission.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.stockcommission.domain.UserVo;

@Mapper
@Component
public interface UserMapper {
	
	
	UserVo findUserInfo(String userid);

	

}
