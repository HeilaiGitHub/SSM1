
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
	<link type="text/css" rel="stylesheet" href="/css/style.css" />
	<script type="text/javascript" src="/js/jquery-1.11.1.min_044d0927.js"></script>

    <script type="text/javascript" src="/js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="/js/menu.js"></script>
	<script type="text/javascript" src="/js/lrscroll_1.js"></script>
	<script type="text/javascript" src="/js/n_nav.js"></script>
    <script type="text/javascript">
        function dosubmit(num){
            document.getElementById('pageIndex').value=num;
            document.getElementById('form_user').submit();
        }
    </script>
		<div class="m_right">
            <p></p>
            <div style="text-align: center">
                <div class="mem_tit">所有用户</div>
                <form id="form_user" action="${pageContext.request.contextPath }/manage/qureyAllUser" method="post">
                    姓名：<input type="text" name="userName" value="${user.userName }"><br>账户：<input type="text" name="loginName" value="${user.loginName }"><br>
                    男：<input type="radio" name="sex" value="1" >女：<input type="radio" name="sex" value="0" ><br>
                    电话：<input type="text" name="mobile" value="${user.mobile }"><br><input type="hidden" name="pageIndex" id="pageIndex">
                    <input type="submit" value="搜索">
                </form>
            </div>
            <table border="0" class="order_tab" style="width:930px; text-align:center; margin-bottom:30px;" cellspacing="0" cellpadding="0">
              <tr>                                                                                                                                                    
                <td width="20%">用户编号</td>
                <td width="25%">用户名</td>
                <td width="25%">真实姓名</td>
                <td width="20%">密码</td>
                <td width="5%">性别</td>
                <td width="5%">操作</td>
              </tr>
              <c:forEach items="${pagebean.list}" var="n">
              	<tr>
                <td><font color="#ff4e00">${n.id}</font></td>
                <td>${n.loginName}</td>
                <td>${n.userName}</td>
                <td>${n.password}</td>
                <td>${n.sex}</td>
                <td><a href="${pageContext.request.contextPath }/manage/delUser/${n.id}">删除</a></td>
              	</tr>
              </c:forEach>
              
            </table>
            <p align="center">每页有${pagebean.pageSize}条，一共${pagebean.pageCount}页，当前${pagebean.pageIndex}页，一共${pagebean.record}条</p>
  		<br>
  		<p align="center">
  		<span><a href="javascript:;" onclick="dosubmit(1)">首页</a></span>
  		<span><a href="javascript:;" onclick="dosubmit(${pagebean.pageIndex}-1)">上一页</a></span>
  		<span><a href="javascript:;" onclick="dosubmit(${pagebean.pageIndex}+1)">下一页</a></span>
  		<span><a href="javascript:;" onclick="dosubmit(${pagebean.pageCount})">尾页</a></span></p>
        </div>
    
