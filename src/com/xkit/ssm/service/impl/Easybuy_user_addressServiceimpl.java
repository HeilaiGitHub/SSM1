package com.xkit.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xkit.ssm.dao.Easybuy_user_addressDAO;
import com.xkit.ssm.entity.Easybuy_user_address;
import com.xkit.ssm.service.Easybuy_user_addressService;
@Service
public class Easybuy_user_addressServiceimpl implements Easybuy_user_addressService {
	
	@Autowired
	private Easybuy_user_addressDAO dao;
	
	public boolean insertUserAddress(Easybuy_user_address addr) {
		return dao.insertAddress(addr)>0;
	}

	public List<Easybuy_user_address> qureyAddress() {
		return dao.qureyAddress();
	}
	
}
