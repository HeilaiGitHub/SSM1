package com.xkit.ssm.handler;

import com.xkit.ssm.entity.Easybuy_product;
import com.xkit.ssm.service.Easybuy_productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class productHandler {

    @Autowired
    private Easybuy_productService ser;


    @RequestMapping("/manage/fenye")
    public String fenye(HttpServletRequest request,Model m){
        int record = ser.record();
        int pageIndex = 1;
        int pageSize = 5;
        int pageCount = record%pageSize==0?record/pageSize:record/pageSize+1;
        if (request.getParameter("index")!=null){
            pageIndex = Integer.parseInt(request.getParameter("index"));
        }
        if (pageIndex<1 || pageIndex>pageCount){
            pageIndex = 1;
        }
        List<Easybuy_product> list = ser.qureyProductLimit(pageIndex, pageSize);
        m.addAttribute("record",record);
        m.addAttribute("pageIndex",pageIndex);
        m.addAttribute("pageSize",pageSize);
        m.addAttribute("pageCount",pageCount);
        m.addAttribute("productList",list);
        return "WEB-INF/manage/productList";
    }
}
