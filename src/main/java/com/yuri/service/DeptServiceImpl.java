package com.yuri.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.yuri.entity.Dept;
import com.yuri.mapper.DeptMapper;
import com.yuri.util.MyBatiesUtil;

/**   
*    
* @Title: DeptServiceImpl.java  
* @Package: com.yuri.service
* @Project: HR
* @Description: 部门业务层的实现类
* @date: 2018年3月26日 下午4:57:33
* @author: yuriFeng
* Contact: yuri_feng@outlook.com 
*      
*/
public class DeptServiceImpl implements DeptService {
	
	
	/**
	 * 通过Mybatis的工具类,按需生成sqlSession,进而动态创建mapper实例,目的是减少持久层和业务层之间的代码耦合
	 */
	SqlSession session = MyBatiesUtil.sqlSession();
	DeptMapper mapper = session.getMapper(DeptMapper.class);

	/* 
	 * 重写部门业务层的查询所有部门
	 * @see com.yuri.service.DeptService#alldept()
	 */
	@Override
	public List<Dept> alldept() {
		return mapper.alldept();
	}

}
