package cn.ethan.mybatis.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ethan.mybatis.dao.UserDao;
import cn.ethan.mybatis.pojo.User;

public class UserDaoTest {

	private ApplicationContext applicationContext;
	
	@Before
	public void init() {
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	@Test
	public void testGetUserList() {
		UserDao userDao = applicationContext.getBean(UserDao.class);
		List<User> userList = userDao.getUserList();
		for (User user : userList) {
			System.out.println(user);
		}
	}

}
