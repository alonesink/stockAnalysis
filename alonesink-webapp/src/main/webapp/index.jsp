<%--
  Created by IntelliJ IDEA.
  User: advids
  Date: 2017/5/31
  Time: 22:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>这是登录页面</title>
</head>
<body>

    <form action="/test/mapping0" method="post">
        <table>
            <tr>
                <label>用户名:</label>
                <input type="text">
            </tr>
            <br>
            <tr>
                <label>密&nbsp;码:</label>
                <input type="password" style="margin-left: 10px">
            </tr>
            <br>
            <tr>
                <td><input type="submit" value="登录"></td>
                <td><input type="button" id="registerBtn" name="register" value="注册"></td>
            </tr>
        </table>
    </form>

</body>
</html>
