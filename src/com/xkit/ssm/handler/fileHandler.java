package com.xkit.ssm.handler;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
@Controller
public class fileHandler {
	@RequestMapping("/addFile")
	public String addFile(HttpServletRequest req,@RequestParam("zp") MultipartFile [] zp,Model m) throws IllegalStateException, IOException{
		for (MultipartFile multipartFile : zp) {
			//获得文件名
			String filename = multipartFile.getOriginalFilename();
			//创建file对象把文件放到file对象中
			File file = new File(req.getRealPath("/")+"/photo/"+filename);
			//写入文件
			multipartFile.transferTo(file);
		}
		m.addAttribute("msg", "上传成功！");
		return "TestFile";
	}
}
