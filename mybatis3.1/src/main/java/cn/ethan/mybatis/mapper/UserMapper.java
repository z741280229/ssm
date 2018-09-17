package cn.ethan.mybatis.mapper;

import java.util.List;

import cn.ethan.mybatis.pojo.User;

public interface UserMapper {
	
	/**
	 * 查询用户列表
	 * @return
	 */
	public List<User> getUserList();
}
