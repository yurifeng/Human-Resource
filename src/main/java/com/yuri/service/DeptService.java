package com.yuri.service;

import java.util.List;

import com.yuri.entity.Dept;

/**   
*    
* @Title: DeptService.java  
* @Package: com.yuri.service
* @Project: HR
* @Description: 部门业务层接口
* @date: 2018年3月26日 下午4:56:52
* @author: yuriFeng
* Contact: yuri_feng@outlook.com 
*      
*/
public interface DeptService {

	/**
	 * 业务层查询所有部门
	 * @return List<Dept>
	 */
	List<Dept> alldept();
}
