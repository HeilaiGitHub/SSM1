package com.xkit.ssm.handler;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xkit.ssm.entity.Easybuy_user;
import com.xkit.ssm.entity.Easybuy_user_address;
import com.xkit.ssm.service.Easybuy_userService;
import com.xkit.ssm.service.Easybuy_user_addressService;

@Controller
public class userAddressHandler {
	
	@Autowired
	private Easybuy_userService userSer;
	
	@Autowired
	private Easybuy_user_addressService addressSer;
	
	@RequestMapping("/initAddress")
	public String initAddress(){
		return "WEB-INF/pages/addUserAddress";
	}
	
	@ModelAttribute("userList")
	public List<Easybuy_user> qureyUser(){
		return userSer.qureyUser();
	}
	
	@RequestMapping("/addUserAddresss")
	public String insertUserAddress(Easybuy_user_address addr,Model m){
		addr.setCreateTime(new Date());
		boolean flag = addressSer.insertUserAddress(addr);
		if(flag){
			m.addAttribute("msg","注册成功！");
			return "WEB-INF/pages/addUserAddress";
		}else{
			m.addAttribute("msg","注册失败！");
			return "WEB-INF/pages/addUserAddress";
		}
		
	}
	
	@RequestMapping("/getAddress/{abc}")
	public String getAddressId(@PathVariable("abc") int id){
		System.out.println("获取的ID为："+id);
		return "showAddress";
	}
	
	@RequestMapping("/selectAddresss")
	public @ResponseBody List<Easybuy_user_address> selectAddress(){
		return addressSer.qureyAddress();
	}
}
