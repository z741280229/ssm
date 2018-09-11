package cn.ethan.mybatis.dao;

import java.util.List;

import cn.ethan.mybatis.pojo.User;

public interface UserDao {
	
	/**
	 * 查询用户列表
	 * @return
	 */
	public List<User> getUserList();
}
