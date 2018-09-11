package cn.ethan.mybatis.test;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ethan.mybatis.mapper.UserMapper;
import cn.ethan.mybatis.pojo.User;
import cn.ethan.mybatis.utils.SqlSessionFactoryUtils;

public class UsermapperTest {
	
	private ApplicationContext applicationContext;
	
	@Before
	public void init() {
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Test
	public void testGetUserList() {
		
		UserMapper usermapper = applicationContext.getBean(UserMapper.class);
		List<User> users = usermapper.getUserList();
		for (User user : users) {
			System.out.println(user);
		}
	}

}
