<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <form action="/0226cj_0327/toDate" method="get">
  <input  name="date" value="2018-10-20 18:23:56" type="text"/>
  <input type="submit" value="提交到日期转换"/>
  </form>
  
  
  <form action="/0226cj_0327/deleteUser">
 Value 1: <input type='checkbox' name='likes' value='1'><br/>
   Value 2: <input type='checkbox' name='likes' value='2'><br/>
   Value 3: <input type='checkbox' name='likes' value='3'><br/>
  
  <input type="submit"/>
  </form>
<br/>
<br/>
<hr/>
  <form action="/0226cj_0327/login"  method="post" >
<table id="login" >
<tr>
<td><h2>登录表单页面</h2> <br></td>
</tr>
<tr>
<td>请输入用户名：</td>
<td><input type="text" name="loginname" placeholder="Please input your name" /></td>
</tr>
<tr>
<td>请输入密码：</td>
<td><input type="password" name="password" placeholder="Please input your password" /></td>
</tr>
<tr>
<td><input type="button" value="我再逛逛" /></td>
<td><input type="submit"  /></td>
</tr>
</table>
</form>

 <form action="/0226cj_0327/register"  method="post" >
<table id="register">
<tr>
<td><h2>新用户注册</h2> <br></td>
</tr>
<tr>
<td>请输入用户名：</td>
<td><input type="text" name="loginname" placeholder="Please input your name" /></td>
</tr>
<tr>
<td>请输入密码：</td>
<td><input type="password" name="password" placeholder="Please input your password" /></td>
</tr>
<tr>
<tr>
<td>请输入昵称：</td>
<td><input type="password" name="username" placeholder="Please input your username" /></td>
</tr>
<tr>
<td><input type="button" value="我再逛逛" /></td>
<td><input type="submit"  /></td>
</tr>
</table>
</form>
  </body>
</html>
