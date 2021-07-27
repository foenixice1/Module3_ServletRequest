<%--
  Created by IntelliJ IDEA.
  User: iU LOVE
  Date: 7/27/2021
  Time: 10:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tinh Chiet Khau</title>
</head>
<body>
<h1>Product Discount Calculator</h1>
<form action="/Discount" method="post">
    <label>Product Description: </label><br>
    <input type="text" name="Description"  placeholder="Mo Ta"> <br>
    <label>List Price: </label><br>
    <input type="text" name="ListPrice" placeholder="Gia SP" ><br>
    <label>Discount Percent: </label><br>
    <input type="text" name="Discount" placeholder="Chiet Khau" ><br>
    <input type="submit" id="submit" value="Calculate Discount ">
</form>
</body>
</html>
