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
   <form action="<%=path %>/login.action" method="post">
   		账户：<input type="text" name="loginName"><br>
   		密码：<input type="password" name="passWord"><br>
   		年龄：<input type="text" name="age"><br>
   		爱好：<input type="checkbox" value="swim" name="like">游泳,<input type="checkbox" value="dolove" name="like">干炮,<input type="checkbox" value="game" name="like">打游戏<br>
   		<input type="submit" value="登录"><br>
   </form>
  </body>
</html>
