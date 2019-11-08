package com.xkit.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xkit.ssm.entity.Easybuy_user;



public interface Easybuy_userDAO {
	public Easybuy_user Login(Easybuy_user user);
	
	public int insert(Easybuy_user user);
	
	public List<Easybuy_user> selectUser();
	
	public int qureyUser(String name);
	
	public List<Easybuy_user> selectUserBypage(@Param("pageIndex") int pageIndex,@Param("pageSize") int pageSize,@Param("user") Easybuy_user user); 
	
	public int count(Easybuy_user user);
	
	public int deleteUser(int id);
}
