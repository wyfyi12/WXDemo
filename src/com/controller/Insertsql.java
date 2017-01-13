package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entities.config;
import com.entities.sqlconfig;
import com.util.Setdata;

@RequestMapping("/wxmvc")
@Controller  
public class Insertsql {  
  
    @RequestMapping(value = "/insertsql")  
    public String insertdata(sqlconfig sqlcf,Model m) {     
		Setdata sd=new Setdata();
		String rs=null;
		try {
			rs=sd.setsqldata(sqlcf.getDriver(),sqlcf.getDburl());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m.addAttribute("rs", rs);
		return "success";
    }
    
    
    
}  
