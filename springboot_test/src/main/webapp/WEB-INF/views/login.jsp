<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/user/login" method="post">
    姓名:<input type="text" name="name" />
    密码:<input type="password" name="pwd" />
    <div>
        <input type="submit" name="login" id="button" value="登陆" />
        <input type="reset" name="reset" id="button3" value="重置" />
    </div>
</form>
</body>
</html>
