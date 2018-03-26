package com.yuri.mapper;

import java.util.List;

import com.yuri.entity.Emp;

/**   
*    
* @Title: EmpMapper.java  
* @Package: com.yuri.mapper
* @Project: HR
* @Description: 员工持久层接口
* @date: 2018年3月26日 下午4:48:03
* @author: yuriFeng
* Contact: yuri_feng@outlook.com 
*      
*/
public interface EmpMapper {

	/**
	 * 持久层增加员工方法
	 * @param emp 员工
	 */
	void insert(Emp emp);

	/**
	 * 持久层根据编号删除员工
	 * @param empid 员工编号
	 */
	void delete(int empid);

	/**
	 * 持久层修改员工
	 * @param emp 员工
	 */
	void update(Emp emp);

	/**
	 * 持久层根据员工编号查询员工
	 * @param id 员工编号
	 * @return Emp 员工
	 */
	Emp select(int id);

	/**
	 * 持久层查询所有员工
	 * @return List<Emp>
	 */
	List<Emp> selectall();
}
