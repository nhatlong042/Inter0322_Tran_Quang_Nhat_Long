<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 30/3/2022
  Time: 4:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Add Customer</title>
    <link rel="stylesheet" href="/person/addCss.css">
</head>
<body>
<form method="post" action="/customer?action=add">
    <div class="wrapper">
        <div class="title">
            Add Customer
        </div>
        <div class="form">
            <div class="inputfield">
                <label>ID Customer</label>
                <input type="text" class="input" name="id">
            </div>
            <div class="inputfield">
                <label>Full Name</label>
                <input type="text" class="input" name="name">
            </div>
            <div class="inputfield">
                <label>Date Of Birth</label>
                <input type="date" class="input" name="dateOfbirth">
            </div>
            <div class="inputfield">
                <label>Gender</label>
                <div class="custom_select" name="gender">
                    <select name="gender">
                        <option value="">Select</option>
                        <option value="male">Male</option>
                        <option value="female">Female</option>
                    </select>
                </div>
            </div>
            <div class="inputfield">
                <label>CMND</label>
                <input type="text" class="input" name="cmnd">
            </div>
            <div class="inputfield">
                <label>Phone Number</label>
                <input type="text" class="input" name="phone">
            </div>
            <div class="inputfield">
                <label>Email</label>
                <input type="email" class="input" name="email">
            </div>
            <div class="inputfield">
                <label>Type Customer</label>
                <div class="custom_select">
                    <select name="type">
                        <option value="">Select</option>
                        <option value="1">Diamond</option>
                        <option value="2">Platinum</option>
                        <option value="3">Gold</option>
                        <option value="4">Silver</option>
                        <option value="5">Member</option>
                    </select>
                </div>
            </div>
            <div class="inputfield">
                <label>Address</label>
                <textarea class="textarea" name="address"></textarea>
            </div>

            <div class="inputfield">
                <button type="submit" class="btn btn-primary">Add Customer</button>
            </div>
        </div>
    </div>
</form>
</body>
</html>
</html>
