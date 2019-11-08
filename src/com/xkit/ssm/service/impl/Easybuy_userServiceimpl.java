package com.xkit.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.xkit.ssm.dao.Easybuy_userDAO;
import com.xkit.ssm.entity.Easybuy_user;
import com.xkit.ssm.service.Easybuy_userService;


@Service
public class Easybuy_userServiceimpl implements Easybuy_userService {
	
	@Autowired
	private Easybuy_userDAO dao;
	
	public Easybuy_user Login(Easybuy_user user) {
		return dao.Login(user);
	}
	
	public boolean insert(Easybuy_user user) {
		int num = dao.insert(user);
		if(num>0){
			return true;
		}
		return false;
	}

	public List<Easybuy_user> qureyUser() {
		return dao.selectUser();
	}

	public boolean selectUser(String name) {
		return dao.qureyUser(name)==0;
	}

	public List<Easybuy_user> selectUserBypage(int pageIndex, int pageSize,
			Easybuy_user user) {
		
		return dao.selectUserBypage(pageIndex, pageSize, user);
	}

	public int count(Easybuy_user user) {
		return dao.count(user);
	}

	public boolean delUser(int id) {
		return dao.deleteUser(id)>0;
	}

}
