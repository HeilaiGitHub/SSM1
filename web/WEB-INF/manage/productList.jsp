<%--
  Created by IntelliJ IDEA.
  User: Mac
  Date: 2019/11/11
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <link type="text/css" rel="stylesheet" href="css/style.css" />
    <script type="text/javascript" src="js/jquery-1.11.1.min_044d0927.js"></script>
    <script type="text/javascript" src="js/jquery.bxslider_e88acd1b.js"></script>

    <script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="js/menu.js"></script>

    <script type="text/javascript" src="js/select.js"></script>
    <title>Title</title>
</head>
<body>
    <table border="0" class="order_tab" style="width:930px; text-align:center; margin-bottom:30px;" cellspacing="0" cellpadding="0">
        <tr>
            <td width="25%">图片</td>
            <td width="25%">名称</td>
            <td width="25%">价格</td>
            <td width="25%">库存</td>
        </tr>
        <c:forEach items="${productList}" var="p">
            <tr>
                <td><img src="${p.fileName}"></td>
                <td>${p.name}</td>
                <td>${p.price}</td>
                <td>${p.stock}</td>
            </tr>
        </c:forEach>
    </table>
    <div align="center" id="div_fenye">
        <p>一共${pageCount}页，当前第${pageIndex}页</p>
        <a href="${pageContext.request.contextPath }/manage/fenye?index=1">首页</a>
        <a href="${pageContext.request.contextPath }/manage/fenye?index=${pageIndex-1}" >上一页</a>
        <a href="${pageContext.request.contextPath }/manage/fenye?index=${pageIndex+1}" >下一页</a>
        <a href="${pageContext.request.contextPath }/manage/fenye?index=${pageCount}" >尾页</a>

        <%-- <p>一共${pageCount}页，当前第${pageIndex}页</p>
        <a href="javascript:;" onclick="fenye(1)" >首页</a>
        <a href="javascript:;" onclick="fenye(${pageIndex-1})" >上一页</a>
        <a href="javascript:;" onclick="fenye(${pageIndex+1})" >下一页</a>
        <a href="javascript:;" onclick="fenye(${pageCount})" >尾页</a> --%>
    </div>
</body>
</html>
