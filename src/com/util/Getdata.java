package com.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Getdata {
	public String corpid="";
	public String corpsercet="";
	public String redirect_uri="";
	public String driver="";
	public String dburl="";
	public int agentid=0;
	static Properties prop = new Properties();
	static String path = Getdata.class.getResource("/").getPath();
	static String websiteURL = (path.replace("/build/classes", "").replace("%20"," ").replace("classes/", "") + "wx.properties").replaceFirst("/", "");
	static String sqlwebsiteURL = (path.replace("/build/classes", "").replace("%20"," ") + "oracle.properties").replaceFirst("/", "");
	public static void getconn() throws Exception{
		 System.out.println("加载配置文件-websiteURL:"+websiteURL);
    	 InputStream ip = new FileInputStream(websiteURL);
 		 prop.load(ip);
 		 ip.close();
	}
	public void getdata() throws Exception{
		getconn();
		corpid = prop.getProperty("corpid");
		corpsercet= prop.getProperty("corpsercet");
		redirect_uri=prop.getProperty("redirect_uri");
		agentid=Integer.parseInt(prop.getProperty("agentid"));
		System.out.println("读取企业号配置,corpid:"+corpid+" corpsercet:"+corpsercet+" redirect_uri:"+redirect_uri);
	}
	public static void getsqlconn() throws Exception{
		 System.out.println("加载数据库配置文件-sqlwebsiteURL:"+sqlwebsiteURL);
   	 InputStream ip = new FileInputStream(sqlwebsiteURL);
		 prop.load(ip);
		 ip.close();
	}
	public void getsqldata() throws Exception{
		getsqlconn();
		driver = prop.getProperty("jdbc.driverClassName");
		dburl= prop.getProperty("jdbc.url");
		System.out.println("读取数据库配置,driver:"+driver+" dburl:"+dburl);
	}
}
