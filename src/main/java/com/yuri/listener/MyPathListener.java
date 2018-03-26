package com.yuri.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


/**   
*    
* @Title: MyPathListener.java  
* @Package: com.yuri.listener
* @Project: HR
* @Description: 设置监听器,在项目启动时,把应用路径放入到最大作用域中
* @date: 2018年3月26日 下午4:45:30
* @author: yuriFeng
* Contact: yuri_feng@outlook.com 
*      
*/
@WebListener
public class MyPathListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext context = sce.getServletContext();
		String base = context.getContextPath();
		context.setAttribute("base", base);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		ServletContext context = sce.getServletContext();
		context.removeAttribute("base");
	}
}
