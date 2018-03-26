package com.yuri.controller;

import java.io.IOException;
import java.util.List;

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
* @Title: ListEmpServlet.java  
* @Package: com.yuri.controller
* @Project: HR
* @Description: 员工列表的控制器
* @date: 2018年3月26日 下午4:41:37
* @author: yuriFeng
* Contact: yuri_feng@outlook.com 
*      
*/
@WebServlet(urlPatterns = "/emp/*")
public class ListEmpServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	EmpService empService = new EmpServiceImpl();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String info = request.getPathInfo();
		if ("/list".equals(info)) {
			List<Emp> l = empService.findall();
			request.setAttribute("emplist", l);
			request.getRequestDispatcher("/WEB-INF/jsp/listemp.jsp").forward(request, response);
		} else if ("/del".equals(info)) {
			int empid = Integer.parseInt(request.getParameter("id"));
			empService.delete(empid);
			List<Emp> l = empService.findall();
			request.setAttribute("emplist", l);
			request.getRequestDispatcher("/WEB-INF/jsp/listemp.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
