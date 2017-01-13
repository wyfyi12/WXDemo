<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta  content="charset=UTF-8">
<title>录入数据库配置信息</title>
<meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1,user-scalable=no">
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">

		<!--标准mui.css-->
		<link rel="stylesheet" href="css/mui.min.css">
		<!--App自定义的css-->
		<link rel="stylesheet" type="text/css" href="css/app.css">
</head>
<body>
<header class="mui-bar mui-bar-nav">
		<p>录入数据库配置信息</p>
		</header>
	<div class="mui-content">
	<form action="wxmvc/insertsql" class="mui-input-group">
	<div class="mui-input-row">
        <label>jdbc.driverClassName</label>
    <input type="text" class="mui-input-clear" placeholder="请输入数据库名称" name="corpid">
    </div>
    <div class="mui-input-row">
        <label>jdbc.url</label>
    <input type="text" class="mui-input-clear" placeholder="请输入数据库地址" name="corpsercet">
    </div>
    <div class="mui-button-row">
        <button type="submit" class="mui-btn mui-btn-primary" >确认</button>
        <button type="reset" class="mui-btn mui-btn-danger" >取消</button>
    </div>
	</form>
	</div>
</body>
</html>