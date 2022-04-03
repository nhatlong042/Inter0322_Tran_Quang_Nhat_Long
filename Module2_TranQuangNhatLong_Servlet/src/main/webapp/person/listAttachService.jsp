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
    <title>List Attach Service</title>
    <script src="bootstrap-5.1.3/js/bootstrap.js"></script>
    <link rel="stylesheet" href="bootstrap-5.1.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="/person/myCss.css">
</head>
<body>
<h2>List Attach Service</h2>
<form class="d-flex" style="float: right">
    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
    <button class="btn btn-outline-success" type="submit">Search</button>
</form>
<table class="table table-bordered">
    <thead>
    <tr class="table-primary">
        <th scope="col">ID Attach Service</th>
        <th scope="col">Name Attach Service</th>
        <th scope="col">Cost</th>
        <th scope="col">Attach Service Unit</th>
        <th scope="col">Attach Service Status</th>
        <th scope="col">Function</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">1</th>
        <td>Karaoke</td>
        <td>10000</td>
        <td>gio</td>
        <td>tien nghi, hien dai</td>
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
        <td>Thue xe may</td>
        <td>10000</td>
        <td>chiec</td>
        <td>hong 1 xe</td>
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
        <td>Thue xe dap</td>
        <td>20000</td>
        <td>chiec</td>
        <td>tot</td>
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
        <td>Buffet buoi sang</td>
        <td>15000</td>
        <td>suat</td>
        <td>day du do an trang mieng</td>
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
        <li class="page-item">
            <a class="page-link" href="#">Next</a>
        </li>
    </ul>
</nav>
<script>
    function add(){
        location.assign("addCustomer.html");
    }
</script>
</body>
</html>
