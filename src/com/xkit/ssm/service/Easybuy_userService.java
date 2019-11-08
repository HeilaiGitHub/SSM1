package com.xkit.ssm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xkit.ssm.entity.Easybuy_user;



public interface Easybuy_userService {
	public Easybuy_user Login(Easybuy_user user);

	public boolean insert(Easybuy_user user);
	
	public List<Easybuy_user> qureyUser();
	
	public boolean selectUser(String name);
	
	public List<Easybuy_user> selectUserBypage(int pageIndex,int pageSize,Easybuy_user user); 
	
	public int count(Easybuy_user user);
	
	public boolean delUser(int id);
}
