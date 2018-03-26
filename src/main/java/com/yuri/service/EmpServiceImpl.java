package com.yuri.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.yuri.entity.Emp;
import com.yuri.mapper.EmpMapper;
import com.yuri.util.MyBatiesUtil;

/**   
*    
* @Title: EmpServiceImpl.java  
* @Package: com.yuri.service
* @Project: HR
* @Description: 员工业务层实现类
* @date: 2018年3月26日 下午5:04:48
* @author: yuriFeng
* Contact: yuri_feng@outlook.com 
*      
*/
public class EmpServiceImpl implements EmpService {

	SqlSession session = MyBatiesUtil.sqlSession();
	EmpMapper mapper = session.getMapper(EmpMapper.class);

	/* 
	 * 重写业务层查询所有员工
	 * @see com.yuri.service.EmpService#findall()
	 */
	@Override
	public List<Emp> findall() {
		List<Emp> l = mapper.selectall();
		return l;
	}

	/* 重写业务层根据id查询员工
	 * @see com.yuri.service.EmpService#find(int)
	 */
	@Override
	public Emp find(int id) {
		return mapper.select(id);
	}

	/* 
	 * 重写业务层增加员工
	 * @see com.yuri.service.EmpService#insert(com.yuri.entity.Emp)
	 */
	@Override
	public void insert(Emp emp) {
		mapper.insert(emp);
		session.commit();
	}

	/* 
	 * 重写业务层根据员工id删除员工
	 * @see com.yuri.service.EmpService#delete(int)
	 */
	@Override
	public void delete(int empid) {
		mapper.delete(empid);
		session.commit();
	}

	/* 
	 * 重写业务层修改员工
	 * @see com.yuri.service.EmpService#update(com.yuri.entity.Emp)
	 */
	@Override
	public void update(Emp emp) {
		mapper.update(emp);
		session.commit();
	}

}
