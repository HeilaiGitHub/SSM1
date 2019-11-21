<%--
  Created by IntelliJ IDEA.
  User: Mac
  Date: 2019/11/21
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link rel="stylesheet" type="text/css" href="ui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="ui/themes/icon.css">
<script type="text/javascript" src="ui/jquery.min.js"></script>
<script type="text/javascript" src="ui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="ui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
    $(function () {
        $("#userGird").datagrid({
            url:"testQureyUser.do",
            columns:[[
                {field:"id",title:"编号",width:100},
                {field:"loginname",title:"用户名",width:100},
                {field:"username",title:"真实姓名",width:100},
                {field:"password",title:"密码",width:100},
                {field:"sex",title:"性别",width:100},
                {field:"identitycode",title:"身份证号",width:300},
                {field:"email",title:"邮箱",width:150},
                {field:"mobile",title:"电话",width:100},
                {field:"-",title:"操作",width:50,formatter:function (value,row,index) {
                        return "<a class=\"easyui-linkbutton\" onclick=\"deleteByid("+ row.id +")\" data-options=\"'iconCls;icon-search'\" href=\"javascript:void(0)\">删除</a>"
                    }}
            ]],
            pagination: true,
            singleSelect: true,
            rownumbers: true
        });
    })
    function deleteByid(id) {
        $.getJSON("deletTestUser.do","id="+id,function (abc) {
            alert(abc.msg);
        })
        $("#userGird").datagrid("reload");
    }
</script>
<head>
    <title>Title</title>
</head>
<body>
    <div id="userGird"></div>
</body>
</html>
