<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Create Location</title>
</head>
<body>
<h2>Vendors:</h2>
<table>
    <tr>
        <th>Id</th>
        <th>code</th>
        <th>name</th>
        <th>type</th>
        <th>email</th>
        <th>phone</th>
        <th>address</th>

    </tr>
    <c:forEach items="${vendorList}" var="vendor">
        <tr>
            <td>${vendor.id}</td>
            <td>${vendor.code}</td>
            <td>${vendor.name}</td>
            <td>${vendor.type}</td>
            <td>${vendor.email}</td>
            <td>${vendor.phone}</td>
            <td>${vendor.address}</td>
            <td><a href="deleteVendor?id=${vendor.id}">Delete</a></td>
            <td><a href="showUpdate?id=${vendor.id}">Update</a> </td>
        </tr>
    </c:forEach>
</table>
</body>
<a href="showCreate">Create new vendor</a>
</html>