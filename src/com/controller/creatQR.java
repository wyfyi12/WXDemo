package com.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.util.EncoderHandler;
import com.util.Getdata;

@RequestMapping("/wxmvc")
@Controller  
public class creatQR {  
  
    @RequestMapping(value = "/getqr")  
    public void getQR(HttpServletResponse resp) throws Exception {   
    	Getdata gd=new Getdata();
    	EncoderHandler eh=new EncoderHandler();
    	gd.getdata();
    	String redirect_urit=gd.redirect_uri;
    	String redirect_uri= java.net.URLEncoder.encode(redirect_urit,   "utf-8"); 
		String qrurl="https://open.weixin.qq.com/connect/oauth2/authorize?appid="+gd.corpid+"&redirect_uri="+redirect_uri+"&response_type=code&scope=SCOPE#wechat_redirect";
		eh.encoderQRCoder(qrurl, resp);
    }
    
    
    
}  
