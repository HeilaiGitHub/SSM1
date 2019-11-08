<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addUserAddress.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  <body>
    <div><p>${msg }</p></div>
    
    <form action="<%=path %>/addUserAddresss.action" method="post" >
    	用户：
    	<select name="userId">
    		<c:forEach items="${userList }" var="user">
    			<option value="${user.id }">${user.userName }</option>
    		</c:forEach>
    	</select><br>
    	地址：<textarea rows="8" cols="100" name="address"></textarea><br>
    	是否默认：<input type="checkbox" value="0" name="isDefault"><br>
    	备注：<textarea rows="8" cols="100" name="remark"></textarea><br>
    	<input type="submit" value="注册">
    </form>
  </body>
</html>
