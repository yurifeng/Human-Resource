package com.yuri.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**   
*    
* @Title: MyBatiesUtil.java  
* @Package: com.yuri.util
* @Project: HR
* @Description: Mybatis的工具类
* @date: 2018年3月26日 下午5:08:33
* @author: yuriFeng
* Contact: yuri_feng@outlook.com 
*      
*/
public class MyBatiesUtil {

	private static SqlSessionFactory sqlSessionFactory = null;

	static {
		try (InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml")) {
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static SqlSession sqlSession() {
		return sqlSessionFactory == null ? null : sqlSessionFactory.openSession();
	}

	public static void close(SqlSession sqlSession) {
		if (sqlSession != null) {
			sqlSession.commit();
			sqlSession.close();
		}
	}
}
