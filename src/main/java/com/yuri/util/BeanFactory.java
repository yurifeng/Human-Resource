package com.yuri.util;

import java.io.InputStream;
import java.util.Properties;

/**   
*    
* @Title: BeanFactory.java  
* @Package: com.yuri.util
* @Project: HR
* @Description: BeanFactory工具类
* @date: 2018年3月26日 下午5:08:20
* @author: yuriFeng
* Contact: yuri_feng@outlook.com 
*      
*/
public class BeanFactory {

	private static Properties prop;

	static {
		try {
			prop = new Properties();
			InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("bean.properties");
			prop.load(in);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Object getBean(String key) {
		Object obj = null;
		try {
			Class<?> c = Class.forName(prop.getProperty(key));
			obj = c.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return obj;
	}
}
