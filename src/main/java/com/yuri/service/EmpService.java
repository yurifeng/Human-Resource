package com.yuri.service;

import java.util.List;

import com.yuri.entity.Emp;

/**   
*    
* @Title: EmpService.java  
* @Package: com.yuri.service
* @Project: HR
* @Description: 员工业务层接口
* @date: 2018年3月26日 下午5:01:57
* @author: yuriFeng
* Contact: yuri_feng@outlook.com 
*      
*/
public interface EmpService {

	/**
	 * 业务层查询所有员工信息
	 * @return List<Emp>
	 */
	List<Emp> findall();

	/**
	 * 业务层根据员工编号查询员工
	 * @param id
	 * @return Emp
	 */
	Emp find(int id);

	/**
	 * 业务层增加新员工
	 * @param emp
	 */
	void insert(Emp emp);

	/**
	 * 业务层根据员工id删除员工
	 * @param empid
	 */
	void delete(int empid);

	/**
	 * 业务层更新员工信息
	 * @param emp
	 */
	void update(Emp emp);
}
