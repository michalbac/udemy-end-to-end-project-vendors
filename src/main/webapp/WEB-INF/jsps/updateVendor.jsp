<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Update Vendor</title>
</head>
<body>
<form action="updateVendor" method="post">
    <pre>
        Id:<input type="text" name="id" value="${vendor.id}" readonly>
        Code:<input type="text" name="code"value="${vendor.code}">
        Name:<input type="text" name="name"value="${vendor.name}">
        Type:<select name="type" size="1">
        <option ${vendor.type='REGULAR'?'selected':''}>REGULAR</option>
        <option ${vendor.type='CONTRACT'?'selected':''}>CONTRACT</option></select>
        Email:<input type="text" name="email" value="${vendor.email}">
        Phone:<input type="text" name="phone" value="${vendor.phone}">
        Address:<textarea name="address" rows="4" cols="50" >${vendor.address}</textarea>
        <input type="submit" value="save"/>
    </pre>
</form>
</body>
</html>