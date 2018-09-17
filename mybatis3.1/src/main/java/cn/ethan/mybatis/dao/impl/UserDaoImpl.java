package cn.ethan.mybatis.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.ethan.mybatis.dao.UserDao;
import cn.ethan.mybatis.pojo.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{

	public List<User> getUserList() {
		SqlSession sqlSession = this.getSqlSession();
		List<User> users = sqlSession.selectList("user.getUserList");
		return users;
	}

}
