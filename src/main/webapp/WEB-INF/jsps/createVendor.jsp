<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Create Vendor</title>
</head>
<body>
<form action="saveVendor" method="post">
    <pre>
        Id:<input type="text" name="id">
        Code:<input type="text" name="code">
        Name:<input type="text" name="name">
        Type:<select name="type" size="1">
        <option value="REGULAR">REGULAR</option>
        <option value="CONTRACT">CONTRACT</option></select>
        Email:<input type="text" name="email">
        Phone:<input type="text" name="phone">
        Address:<textarea name="address" rows="4" cols="40">
    </textarea>
        <input type="submit" value="save"/>
    </pre>
</form>
${msg}
<a href="showVendors">View all</a>
</body>
</html>

