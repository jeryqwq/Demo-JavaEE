<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>  
 
<!DOCTYPE HTML5">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录到主页</title>
	<link rel="stylesheet" type="text/css" href="styles.css">->

</head>
  
  <body>
<h2>输入错误，请重新输入</h2> <br>
<a href="/0226cj_0314" >点击跳转到主页</a>
  </body>
</html>
