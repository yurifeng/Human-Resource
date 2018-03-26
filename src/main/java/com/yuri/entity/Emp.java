package com.yuri.entity;

import java.util.Date;

import lombok.Data;

/**   
*    
* @Title: Emp.java  
* @Package: com.yuri.entity
* @Project: HR
* @Description: 员工(emp)实体类
* @date: 2018年3月26日 下午4:43:59
* @author: yuriFeng
* Contact: yuri_feng@outlook.com 
*      
*/
@Data
public class Emp {

	/**
	 * 员工编号
	 */
	private int empid;

	/**
	 * 员工名字
	 */
	private String ename;

	/**
	 * 员工性别
	 */
	private int egendar;

	/**
	 * 员工部门编号
	 */
	private int depid;

	/**
	 * 员工入职日期
	 */
	private Date empdate;
}
