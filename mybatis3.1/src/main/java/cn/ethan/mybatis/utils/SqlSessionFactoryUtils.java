package cn.ethan.mybatis.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtils {

	private static SqlSessionFactory sqlSessionFactory;
	
	static {
		
		try {
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
			sqlSessionFactory = ssfb.build(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//声明成静态的方法，不然在类以外不能被调用
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
}
