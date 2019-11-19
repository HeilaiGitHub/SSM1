package com.xkit.ssm.service;

import java.util.List;

import com.xkit.ssm.entity.EasybuyUser;
import org.apache.ibatis.annotations.Param;




public interface Easybuy_userService {
	public EasybuyUser Login(EasybuyUser user);

	public boolean insert(EasybuyUser user);
	
	public List<EasybuyUser> qureyUser();
	
	public boolean selectUser(String name);
	
	public List<EasybuyUser> selectUserBypage(int pageIndex,int pageSize,EasybuyUser user);
	
	public int count(EasybuyUser user);
	
	public boolean delUser(int id);
}
