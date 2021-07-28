
<%@ page import="models.DanhSachKH" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: iU LOVE
  Date: 7/28/2021
  Time: 11:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh Sách Khách Hàng</title>
    <style>
        td {
            font-size: 16px;
            font-family: Tahoma;
            text-align: center;
            color: black;
            background-color: white;
        }

        tr {
            background-color: gray;
            color: white;
        }

    </style>
</head>
<body>
<table style="color: blue" ; border="1px">
    <thead>
    <th colspan="4">
        <h1>Danh sách khách hàng</h1>
    </th>
    </tr>
    <tr>
        <td width="300px" height="60px"><b>Fullname</b></td>
        <td width="300px" height="60px"><b>Date of birth</b></td>
        <td width="300px" height="60px"><b>Address</b></td>
        <td width="300px" height="60px"><b>Avatar</b></td>
<%--        <td width="300px" height="60px"><b>Delete</b></td>--%>


    </tr>
    </thead><tr>
<%--    <tbody>--%>
<%--    <%--%>
<%--        ArrayList<DanhSachKH> list = (ArrayList<DanhSachKH>) request.getAttribute("listKH");--%>
<%--        String str = "";--%>
<%--        for (DanhSachKH p : list) {--%>
<%--            str += "<tr> <td>" + p.getName() + "</td><td>" + p.getNgaySinh() + "</td><td>" + p.getDiaChi() + "</td><td><img width=\"200px\" height=\"100px\" src=\"" + p.getImg() + "\"></td></tr>";--%>
<%--        }--%>
<%--        out.println(str);--%>
<%--    %>--%>
<%--    </tbody>--%>
    <c:forEach var="kh" items="${listKH}">
    <tr>
        <td>${kh.name}</td>
        <td>${kh.ngaySinh}</td>
        <td>${kh.diaChi}</td>
        <td><img width="200px" height="100px" src="${kh.img}"></td>
    </tr>
    </c:forEach>
</table>

</body>
</html>
