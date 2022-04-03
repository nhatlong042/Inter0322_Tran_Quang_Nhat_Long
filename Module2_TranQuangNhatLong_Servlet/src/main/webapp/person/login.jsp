<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 30/3/2022
  Time: 4:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width">

    <link rel="stylesheet" href="../bootstrap-5.1.3/css/bootstrap.css">
    <link rel="stylesheet" href="/person/loginCss.css">
</head>
<body>
<div class="login-box">
    <h1>Login</h1>
    <div class="textbox">
        <i class="fa fa-user" aria-hidden="true"></i>
        <input type="text" placeholder="UserName" name="" value="">
    </div>

    <div class="textbox">
        <i class="fa fa-lock" aria-hidden="true"></i>
        <input type="password" placeholder="Password" name="" value="">
    </div>
    <div class="mb-3 form-check">
        <input type="checkbox" class="form-check-input" id="exampleCheck1">
        <label class="form-check-label" for="exampleCheck1">Remember me</label>
    </div>
    <input type="submit" class="btn" name="" value="Enter">
</div>
</body>
</html>
