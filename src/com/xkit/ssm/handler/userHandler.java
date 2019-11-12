package com.xkit.ssm.handler;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xkit.ssm.entity.Easybuy_user;
import com.xkit.ssm.service.Easybuy_userService;
import com.xkit.ssm.tool.PageBean;
import com.xkit.ssm.velidator.UserLogin;
import com.xkit.ssm.velidator.UserRegist;


@Controller
public class userHandler {
	
	@Autowired
	private Easybuy_userService ser;
	
	@RequestMapping("/login")
	public String login(@Validated(value={UserLogin.class}) Easybuy_user user,BindingResult r,HttpSession session,Model m){
		if(r.hasFieldErrors()){
			return "Login";
		}
		Easybuy_user u = ser.Login(user);
		if(u==null){
			m.addAttribute("msg", "登录失败");
			return "Login";
		}else{
			session.setAttribute("loginUser", u);
			m.addAttribute("zh", u.getLoginName());
			return "WEB-INF/manage/mainIndex";
		}
	}
	
	@RequestMapping("/regist")
	public String insert(@Validated(value={UserRegist.class}) Easybuy_user user,BindingResult r,Model m){
		if(r.hasFieldErrors()){
			m.addAttribute("msg", "注册失败！");
			return "Regist";
		}
		user.setSex(0);
		user.setType(0);
		boolean flag = ser.insert(user);
		if(flag){
			m.addAttribute("msg", "注册成功！");
			return "Login";
		}else{
			m.addAttribute("msg", "注册失败！");
			return "Regist";
		}
	}

	@RequestMapping("/text")
	public String test(){
	return "welcome";
	}

	@RequestMapping(value="/ajaxUser")
	public @ResponseBody String selectUser(String name){
		boolean isok = ser.selectUser(name);
		String rs=null;
		if(isok){
			rs="{\"msg\":\"���û���ʹ��!\"}";
		}else{
			rs="{\"msg\":\"���û�����ʹ��!\"}";
		}
		return rs;
	}
	
	@RequestMapping("/manage/welcome")
	public String welcome(){
		return "WEB-INF/manage/welcome";
	}
	
	@RequestMapping("/manage/qureyAllUser")
	public String qureyAllUser(Model m,Easybuy_user user,@RequestParam(defaultValue="1") int pageIndex){
		int pageSize = 4;
		int record = ser.count(user);
		int pageCount = record%pageSize==0?record/pageSize:record/pageSize+1;
		if(pageIndex<1 || pageIndex>pageCount){
			pageIndex = 1;
		}
		List<Easybuy_user> list = ser.selectUserBypage((pageIndex-1)*pageSize, pageSize, user);
		PageBean pagebean = new PageBean();
		pagebean.setList(list);
		pagebean.setPageCount(pageCount);
		pagebean.setPageIndex(pageIndex);
		pagebean.setPageSize(pageSize);
		pagebean.setRecord(record);
		m.addAttribute("pagebean", pagebean);
		m.addAttribute("user", user);
		return "WEB-INF/manage/userList";
	}
	
	@RequestMapping("/manage/delUser/{id}")
	public String delUser(@PathVariable("id") int id,Model m){
		boolean isok = ser.delUser(id);
		if(isok){
			m.addAttribute("msg", "删除成功！");
			return "forward:/manage/qureyAllUser";
		}else{
			m.addAttribute("msg", "删除失败！");
			return "forward:/manage/qureyAllUser";
		}
	}

}
