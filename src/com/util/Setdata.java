package com.util;

import java.io.File;
import java.io.PrintStream;
import java.util.Properties;

public class Setdata {
	public String corpid="";
	public String corpsercet="";
	static Properties prop = new Properties();
	static String path = Setdata.class.getResource("/").getPath();
	static String websiteURL = (path.replace("/build/classes", "").replace("%20"," ").replace("classes/", "") + "wx.properties").replaceFirst("/", "");
	static String sqlwebsiteURL = (path.replace("/build/classes", "").replace("%20"," ") + "oracle.properties").replaceFirst("/", "");
	
	public String setdata(String corpid,String corpsercet,String redirect_uri,String agentid) throws Exception{
		prop.setProperty("corpid", corpid);
		prop.setProperty("corpsercet", corpsercet);
		prop.setProperty("redirect_uri", redirect_uri);
		prop.setProperty("agentid", agentid);
		PrintStream fW = new PrintStream(new File(websiteURL));
		prop.store(fW, "update");
		System.out.println("修改企业号配置,corpid:"+corpid+" corpsercet:"+corpsercet+" redirect_uri:"+redirect_uri+" agentid:"+agentid);
		return "修改企业号配置,corpid:"+corpid+" corpsercet:"+corpsercet+" redirect_uri:"+redirect_uri+" agentid:"+agentid;
	}
	
	public String setsqldata(String driver,String dburl) throws Exception{
		prop.setProperty("jdbc.driverClassName", driver);
		prop.setProperty("jdbc.url", dburl);
		PrintStream fW = new PrintStream(new File(websiteURL));
		prop.store(fW, "update");
		System.out.println("修改数据库配置,jdbc.driverClassName:"+driver+" jdbc.url:"+dburl);
		return "修改数据库配置,jdbc.driverClassName:"+driver+" jdbc.url:"+dburl;
	}
}
