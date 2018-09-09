<%--
  Created by IntelliJ IDEA.
  User: sgq
  Date: 2018/9/1
  Time: 下午3:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<span style="color: red">${bookUserType}</span>欢迎您！
<table id="bookList" style="width: auto;border: 1px solid;">
    <tr aria-colspan="8"><td>图书详细信息列表</td></tr>
    <tr><td>书名</td><td>作者</td><td>出版社</td><td>出版日期</td><td>页数</td><td>价格</td><td>内容摘要</td><td>操作</td></tr>
</table>
<div id="barcon">
    <%--共${page.totalCount}条记录 每页4条 第${page.currentPage}页/共${page.pageCount}页--%>
</div>
</body>
<script src="http://localhost:8082/js/jquery-1.12.4.js"></script>
<script src="http://localhost:8082/js/opperate.js"></script>
<script>
    <%--前台分页--%>
    $(document).ready(function () {
        $.ajax({
            url:"/book/show",
            dataType:"json",
            type:"post",
            success:function (data) {//全部book列表
                console.log(data);
                var html = "";
                $.each(data,function (index,element) {
                    html+="<tr><td>"+element.name+"</td><td>"+element.author+"</td><td>"+element.publish+"</td><td>"+element.publishdate+"</td><td>"+element.page+"</td><td>"+element.price+"</td><td>"+element.content+"</td>";
                    html+="<td><a href='http://localhost:8082/modify.jsp?id="+element.id+"'>修改</a><a href='/book/delete?id="+element.id+"'>删除</a></td></tr>";
                });
                $("#bookList").append(html);
            }
        });
        var currentPage = getUrlParam("currentPage");
        var pageSize = getUrlParam("pageSize");
        if (currentPage==null)
            currentPage = 1;
        if (pageSize==null) {
            pageSize = 4;
        }
        goPage(currentPage,pageSize);
    });
</script>
</html>

