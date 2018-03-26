package com.yuri.mapper;

import java.util.List;

import com.yuri.entity.Dept;


/**   
*    
* @Title: DeptMapper.java  
* @Package: com.yuri.mapper
* @Project: HR
* @Description: 部门持久层接口
* @date: 2018年3月26日 下午4:46:41
* @author: yuriFeng
* Contact: yuri_feng@outlook.com 
*      
*/
public interface DeptMapper {
	
	/**
	 * 持久层查询所有部门
	 * @return List<Dept>
	 */
	List<Dept> alldept();
}
