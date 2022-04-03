<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 30/3/2022
  Time: 3:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>List Customer</title>
    <script src="bootstrap-5.1.3/js/bootstrap.js"></script>
    <link rel="stylesheet" href="/bootstrap-5.1.3/css/bootstrap.css">
    <link rel="stylesheet" href="/person/myCss.css">
</head>
<body>
<h2>List Customer</h2>
<form class="d-flex" style="float: right">
    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
    <button class="btn btn-outline-success" type="submit">Search</button>
</form>
<table class="table table-bordered">
    <a href="/customer?action=add" class="btn btn-info">Add</a>
    <thead>
        <tr class="table-primary">
        <th scope="col">ID Customer</th>
        <th scope="col">Full Name</th>
        <th scope="col">Date Of Birth</th>
        <th scope="col">Gender</th>
        <th scope="col">ID Card</th>
        <th scope="col">Phone</th>
        <th scope="col">Email</th>
        <th scope="col">Address</th>
        <th scope="col">Type</th>
        <th scope="col">Function</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach var="customer" items="${customerList}">
        <tr>
        <th scope="row">${customer.id}</th>
        <td>${customer.name}</td>
        <td>${customer.dateOfbirth}</td>
        <td>${customer.gender}</td>
        <td>${customer.cmnd}</td>
        <td>${customer.phone}</td>
        <td>${customer.email}</td>
        <td>${customer.address}</td>
            <c:choose>
                <c:when test="${customer.type == 1}">
                    <td>Diamond</td>
                </c:when>
                <c:when test="${customer.type == 2}">
                    <td>Platinium</td>
                </c:when>
                <c:when test="${customer.type == 3}">
                    <td>Gold</td>
                </c:when>
                <c:when test="${customer.type == 4}">
                    <td>Silver</td>

                </c:when>
                <c:when test="${customer.type == 5}">
                    <td>Menber</td>
                </c:when>
                <c:otherwise>
                    <td>Khác</td>
                </c:otherwise>
            </c:choose>
        <td>
            <button class="btn btn-outline-info" type="button" onclick="">Edit</button>
            <button onclick="onDelete(${customer.id})" type="button" class="btn btn-outline-danger" data-toggle="modal" data-target="#modelId">
                Delete
            </button>

        </td>
    </tr>
    </c:forEach>
    </tbody>
</table>

<!-- Modal -->
<div class="modal fade" id="modelId" tabindex="-1" role="dialog" aria-labelledby="modelTitleId" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Confirm Delete</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <form action="/customer" method="post">
                <input type="hidden" name="action" value="delete">
                <input type="hidden" name="id" id="idCustomerDel">
                <div class="modal-body">
                    Ban co muon xoa khong ??
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Delete</button>
                </div>
            </form>
        </div>
    </div>
</div>
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
        location.assign("/person/addCustomer.jsp");
    }
    function onDelete(idCustomerDel) {
        document.getElementById("idCustomerDel").value= idCustomerDel;
    }
</script>
</body>
</html>