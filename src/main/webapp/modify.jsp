<%--
  Created by IntelliJ IDEA.
  User: sgq
  Date: 2018/9/1
  Time: 下午5:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改页面</title>
</head>
<body>
<form action="/book/modify" method="post" onsubmit="return yanzheng()">
    <table>
        <tr aria-colspan="2"><td>编辑图书</td></tr>
        <input type="hidden" id="hid" value="<%=request.getParameter("id")%>" name="id">
        <tr><td>书名<span style="color: red">(*)</span></td><td><input type="text" name="bookName"/></td></tr>
        <tr><td>作者<span style="color: red">(*)</span></td><td><input type="text" name="bookAuthor"/></td></tr>
        <tr><td>出版社<span style="color: red">(*)</span></td><td><input type="text" name="publish"/></td></tr>
        <tr><td>出版日期<span style="color: red">(*)</span></td><td><input type="text" name="publishdate"/>(yyyy-MM-dd)</td></tr>
        <tr><td>页数</td><td><input type="text" name="page"/></td></tr>
        <tr><td>价格</td><td><input type="text" name="price"/></td></tr>
        <tr><td>内容摘要</td><td><textarea rows="20" name="content"></textarea></td></tr>
        <tr aria-colspan="2"><td><input type="submit" value="提交"/><button onclick="fanhui()">返回</button></td></tr>
    </table>
</form>
</body>
<script src="http://localhost:8082/js/jquery-1.12.4.js"></script>
<script src="layer/layer.js"></script>
<script>
    console.log(document.getElementById("hid").valueOf());
    function fanhui() {
        window.location.href = "http://localhost:8082/manageBooks.jsp";
    }
    function yanzheng()
    {
        if ($("[name=bookName]").val()==null){
            layer.prompt(function(val, index){
                layer.msg('用户名不能为空');
            });
        }
        else if ($("[name=bookAuthor]").val()==null){
            layer.prompt(function(val, index){
                layer.msg('作者不能为空');
            });
        }
        else if ($("[name=publish]").val()==null){
            layer.prompt(function(val, index){
                layer.msg('出版社不能为空');
            });
        }
        else if ($("[name=publishdate]").val()==null){
            layer.prompt(function(val, index){
                layer.msg('出版日期不能为空');
            });
        }
        else{
            return true;
        }
        return false;
    }
</script>
</html>
