<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta content="charset=utf-8">
<title>录入配置信息结果</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1,maximum-scale=1,user-scalable=no">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">

<!--标准mui.css-->
<link rel="stylesheet" href="css/mui.min.css">
<!--App自定义的css-->
<link rel="stylesheet" type="text/css" href="css/app.css">
</head>
<body>
	<h4>Success Page</h4>
</body>
<header class="mui-bar mui-bar-nav">
<h1 class="mui-title">录入配置信息结果</h1>
</header>
<div class="mui-content">
	<div class="mui-content-padded">
		<p>
			结果：<%=request.getAttribute("rs")%>
		</p>
	</div>
</div>
</div>