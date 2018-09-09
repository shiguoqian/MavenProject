<%--
  Created by IntelliJ IDEA.
  User: sgq
  Date: 2018/9/1
  Time: 下午4:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增图书页面</title>
</head>
<body>
<form action="/book/add" method="post" onsubmit="return yanzheng()">
    <table>
        <tr aria-colspan="2"><td>增加图书</td></tr>
        <tr><td>书名<span style="color: red">(*)</span></td><td><input type="text" name="bookName" id="bookName"/></td></tr>
        <tr><td>作者<span style="color: red">(*)</span></td><td><input type="text" name="bookAuthor"/></td></tr>
        <tr><td>出版社<span style="color: red">(*)</span></td><td><input type="text" name="publish"/></td></tr>
        <tr><td>出版日期<span style="color: red">(*)</span></td><td><input type="text" name="publishdate"/>(yyyy-MM-dd)</td></tr>
        <tr><td>页数</td><td><input type="text" name="page"/></td></tr>
        <tr><td>价格</td><td><input type="text" name="price"/></td></tr>
        <tr><td>内容摘要</td><td><textarea rows="20" name="content"></textarea></td></tr>
        <tr aria-colspan="2"><td> <button type="submit">submit</button> <button onclick="fanhui()">返回</button></td></tr>
    </table>
</form>
</body>
<script src="http://localhost:8082/js/jquery-1.12.4.js"></script>
<script src="http://localhost:8082/layer/layer.js"></script>
<script>
    function fanhui() {
        window.location.href = "http://localhost:8082/manageBooks.jsp";
    };
    function yanzheng()
    {
        console.log("进入yanzheng");
        console.log($("#bookName").val());
        if ($("#bookName").val()==undefined){
            layer.tips('用户名不能为空', '#id或者.class', {
                tips: [1, '#0FA6D8'] //还可配置颜色
            });
            return false;
        }
        else if ($("[name='bookAuthor']").val()==null){
            layer.prompt(function(val, index){
                layer.msg('作者不能为空');
                return false;
            });
        }
        else if ($("[name='publish']").val()==null){
            layer.prompt(function(val, index){
                layer.msg('出版社不能为空');
                return false;
            });
        }
        else if ($("[name='publishdate']").val()==null){
            layer.prompt(function(val, index){
                layer.msg('出版日期不能为空');
                return false;
            });
        }
        return true;
    }
</script>
</html>
