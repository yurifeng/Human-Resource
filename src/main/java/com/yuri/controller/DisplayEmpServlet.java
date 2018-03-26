package com.yuri.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yuri.entity.Emp;
import com.yuri.service.EmpService;
import com.yuri.service.EmpServiceImpl;


/**   
*    
* @Title: DisplayEmpServlet.java  
* @Package: com.yuri.controller
* @Project: HR
* @Description: 
* @date: 2018年3月26日 下午4:38:05
* @author: yuriFeng
* Contact: yuri_feng@outlook.com 
*      
*/
@WebServlet(urlPatterns="/dis/*")
public class DisplayEmpServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	EmpService empService = new EmpServiceImpl();
       
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String info=request.getPathInfo();
		int id=Integer.parseInt(request.getParameter("id"));
		if("/display".equals(info)){
			Emp e=empService.find(id);
			request.setAttribute("emp", e);
			request.getRequestDispatcher("/WEB-INF/jsp/displayemp.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
