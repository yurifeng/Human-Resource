--删除部门表
drop table yuri_dept;

--创建部门表
create table yuri_dept(
deptid number(7) primary key,
dname  VARCHAR2(50)
);

--删除部门序列
drop sequence yuri_dept_id;

--创建部门序列
create sequence yuri_dept_id;

--删除员工表
drop table yuri_emp;

--创建员工表
create table yuir_emp(
empid number(7) primary key,
ename VARCHAR2(50) not null,
egendar number(1) not NULL,
depid number(7) not null,
empdate date not NULL
);

--删除员工序列
drop sequence yuri_emp_id;

--创建员工序列
create sequence yuri_emp;


--插入数据
INSERT into yuri_dept values(1,'人力资源');
INSERT into yuri_dept values(2,'市场');