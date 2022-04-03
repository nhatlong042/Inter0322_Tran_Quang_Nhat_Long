<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 30/3/2022
  Time: 4:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>List Employee</title>
    <script src="bootstrap-5.1.3/js/bootstrap.js"></script>
    <link rel="stylesheet" href="../bootstrap-5.1.3/css/bootstrap.css">
    <link rel="stylesheet" href="/person/myCss.css">
</head>
<body>
<h2>List Employee</h2>
<form class="d-flex" style="float: right">
    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
    <button class="btn btn-outline-success" type="submit">Search</button>
</form>
<table class="table table-bordered">
    <thead>
    <tr class="table-primary">
        <th scope="col">ID Employee</th>
        <th scope="col">Full Name</th>
        <th scope="col">Date Of Birth</th>
        <th scope="col">ID Card</th>
        <th scope="col">Salary</th>
        <th scope="col">Phone</th>
        <th scope="col">Email</th>
        <th scope="col">Address</th>
        <th scope="col">Prosition ID</th>
        <th scope="col">Education ID</th>
        <th scope="col">Division ID</th>
        <th scope="col">Function</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">1</th>
        <td>Minh</td>
        <td>10/12/1989</td>
        <td>1000344322</td>
        <td>10000000</td>
        <td>0110023219</td>
        <td>tuanminh@gmail.com</td>
        <td>05 Le Do</td>
        <td>01</td>
        <td>02</td>
        <td>01</td>
        <td>
            <form class="d-flex">
                <button class="btn btn-outline-info" type="button" onclick="add()">Add</button>
                <button class="btn btn-outline-info" type="button" onclick="">Edit</button>
                <button class="btn btn-outline-info" type="button" onclick="">Delete</button>
            </form>
        </td>
    </tr>
    <tr>
        <th scope="row">2</th>
        <td>Tung</td>
        <td>03/05/1999</td>
        <td>1213074322</td>
        <td>8000000</td>
        <td>0812321312</td>
        <td>duytung@gmail.com</td>
        <td>200 Ton Duc Thang</td>
        <td>02</td>
        <td>03</td>
        <td>02</td>
        <td>
            <form class="d-flex">
                <button class="btn btn-outline-info" type="button" onclick="add()">Add</button>
                <button class="btn btn-outline-info" type="button" onclick="">Edit</button>
                <button class="btn btn-outline-info" type="button" onclick="">Delete</button>
            </form>
        </td>
    </tr>
    <tr>
        <th scope="row">3</th>
        <td>Phuc</td>
        <td>24/11/1995</td>
        <td>191013220</td>
        <td>12000000</td>
        <td>0815761323</td>
        <td>anphuc@gmail.com</td>
        <td>06 Le Do</td>
        <td>03</td>
        <td>02</td>
        <td>01</td>
        <td>
            <form class="d-flex">
                <button class="btn btn-outline-info" type="button" onclick="add()">Add</button>
                <button class="btn btn-outline-info" type="button" onclick="">Edit</button>
                <button class="btn btn-outline-info" type="button" onclick="">Delete</button>
            </form>
        </td>
    </tr>
    <tr>
        <th scope="row">4</th>
        <td>Tho</td>
        <td>06/07/1988</td>
        <td>144115229</td>
        <td>9000000</td>
        <td>0954329332</td>
        <td>thonguyen@gmail.com</td>
        <td>200 Ly Thai To</td>
        <td>03</td>
        <td>03</td>
        <td>01</td>
        <td>
            <form class="d-flex">
                <button class="btn btn-outline-info" type="button" onclick="add()">Add</button>
                <button class="btn btn-outline-info" type="button" onclick="">Edit</button>
                <button class="btn btn-outline-info" type="button" onclick="">Delete</button>
            </form>
        </td>
    </tr>
    </tbody>
</table>
<nav aria-label="Page navigation example">
    <ul class="pagination justify-content-center">
        <li class="page-item disabled">
            <a class="page-link">Previous</a>
        </li>
        <li class="page-item"><a class="page-link" href="#">1</a></li>
        <li class="page-item"><a class="page-link" href="#">2</a></li>
        <li class="page-item"><a class="page-link" href="#">3</a></li>
        <li class="page-item"><a class="page-link" href="#">4</a></li>
        <li class="page-item"><a class="page-link" href="#">5</a></li>
        <li class="page-item"><a class="page-link" href="#">6</a></li>
        <li class="page-item">
            <a class="page-link" href="#">Next</a>
        </li>
    </ul>
</nav>
<script>
    function add(){
        location.assign("/person/addEmployee.jsp");
    }
</script>
</body>
</html>
