package com.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.userMapper;
import com.entities.userEntity;
import com.util.Getdata;
import com.util.dojson;
import com.util.wxutil;

import net.sf.json.JSONObject;

@RequestMapping(value = "/wxmvc")
@Controller
public class getuserinfo {
	
	@Autowired
	private userMapper usermap;
	
	@RequestMapping(value = "/info")
	public String getinfo(HttpServletRequest req, HttpServletResponse resp,ModelMap model) throws Exception {
		Getdata gd = new Getdata();
		wxutil wt = new wxutil();
		gd.getdata();
		dojson dj=new dojson();
		String code = req.getParameter("code");
		System.out.println("CODE:" + code);
		wt.gettoken(gd.corpid, gd.corpsercet);
		String uid = wt.getuid(code);
		System.out.println("获取的userid:" + uid);
		userEntity ue=usermap.getuser(uid);
		JSONObject txtjob=dj.gettxtjob(gd.agentid, "text", uid, "用户："+ue.getUserName()+",您的座位号为："+ue.getUserPlace());
		System.out.println("发送的信息为："+txtjob.toString());
		wt.sendtext(txtjob);
		model.addAttribute("place",ue.getUserPlace()); 
		return "rs";
	}

	
}
