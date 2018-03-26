/***
 * 
 */

package com.yuri.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yuri.entity.Dept;
import com.yuri.entity.Emp;
import com.yuri.service.DeptService;
import com.yuri.service.DeptServiceImpl;
import com.yuri.service.EmpService;
import com.yuri.service.EmpServiceImpl;

/**   
*    
* @Title: AddEmpServlet.java  
* @Package: com.yuri.controller
* @Project: HR
* @Description: 添加员工的控制器
* @date: 2018年3月26日 下午4:34:39
* @author: yuriFeng
* Contact: yuri_feng@outlook.com 
*      
*/
@WebServlet(urlPatterns = "/add/*")
public class AddEmpServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	DeptService de = new DeptServiceImpl();

	EmpService empService = new EmpServiceImpl();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String info = request.getPathInfo();
		if ("/preadd".equals(info)) {
			List<Dept> l = de.alldept();
			request.setAttribute("deptlist", l);
			request.getRequestDispatcher("/WEB-INF/jsp/addemp.jsp").forward(request, response);
		} else if ("/add".equals(info)) {
			int depid = Integer.parseInt(request.getParameter("bumen"));
			int egendar = Integer.parseInt(request.getParameter("nan"));
			String ename = request.getParameter("ename");
			Emp emp = new Emp();
			emp.setDepid(depid);
			emp.setEgendar(egendar);
			emp.setEmpdate(new Date());
			emp.setEname(ename);
			empService.insert(emp);

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
