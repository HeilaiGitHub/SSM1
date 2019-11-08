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
			//����ļ���
			String filename = multipartFile.getOriginalFilename();
			//����file������ļ��ŵ�file������
			File file = new File(req.getRealPath("/")+"/photo/"+filename);
			//д���ļ�
			multipartFile.transferTo(file);
		}
		m.addAttribute("msg", "�ϴ��ɹ���");
		return "TestFile";
	}
}
