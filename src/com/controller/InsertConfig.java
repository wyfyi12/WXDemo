package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entities.config;
import com.util.Setdata;

@RequestMapping("/wxmvc")
@Controller  
public class InsertConfig {  
  
    @RequestMapping(value = "/insertconfig")  
    public String insertdata(config cf,Model m) {     
		Setdata sd=new Setdata();
		String rs=null;
		try {
			rs=sd.setdata(cf.getCorpid(), cf.getCorpsercet(), cf.getRedirect_uri(),cf.getAgentid());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m.addAttribute("rs", rs);
		return "success";
    }
    
    
    
}  
