package com.xkit.ssm.service.impl;

import java.util.List;

import com.xkit.ssm.dao.EasybuyUserMapper;
import com.xkit.ssm.entity.EasybuyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xkit.ssm.service.Easybuy_userService;


@Service
public class Easybuy_userServiceimpl implements Easybuy_userService {
	
	@Autowired
	private EasybuyUserMapper dao;
	
	public EasybuyUser Login(EasybuyUser user) {
		return dao.Login(user);
	}
	
	public boolean insert(EasybuyUser user) {
		int num = dao.insert(user);
		if(num>0){
			return true;
		}
		return false;
	}

	public List<EasybuyUser> qureyUser() {
		return dao.selectUser();
	}

	public boolean selectUser(String name) {
		return dao.qureyUser(name)==0;
	}

	public List<EasybuyUser> selectUserBypage(int pageIndex, int pageSize,
											  EasybuyUser user) {
		
		return dao.selectUserBypage(pageIndex, pageSize, user);
	}

	public int count(EasybuyUser user) {
		return dao.count(user);
	}

	public boolean delUser(int id) {
		return dao.deleteUser(id)>0;
	}

}
