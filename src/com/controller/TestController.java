package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.util.Getdata;
import com.util.Setdata;
import com.util.wxutil;

@Controller  
public class TestController {  
  
    @RequestMapping(value = "testuid")  
    public void uid() {     
    	wxutil wu=new wxutil();
		Getdata gd=new Getdata();
		try {
			gd.getdata();
			wu.gettoken(gd.corpid, gd.corpsercet);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    @RequestMapping(value = "mui")  
    public String mui() {  
    	return "muiindex";
    }
    
    @RequestMapping(value = "rs")  
    public String rs() {  
    	return "rs";
    }
    @RequestMapping(value = "sql")  
    public String sqltest() throws Exception { 
    	Getdata gd=new Getdata();
    	gd.getsqldata();
    	Setdata sd=new Setdata();
    	sd.setsqldata(gd.driver, gd.dburl);
    	return "rs";
    }
}  
