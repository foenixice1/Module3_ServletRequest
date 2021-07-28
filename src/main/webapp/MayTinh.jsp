<%--
  Created by IntelliJ IDEA.
  User: Nguyen Hoai Nam
  Date: 7/28/2021
  Time: 4:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Máy tính đơn giản</title>
</head>
<body>
<div>
    <h1>Simple Calculator</h1>
    <form action="/maytinh" method="post">
        <fieldset style="width: 400px">
            <legend>Calculator</legend>
            <table>
                <tr>
                    <td>First operand:</td>
                    <td><input type="text" name="first" placeholder="0"></td>
                </tr>
                <tr>
                    <td>Operator:</td>
                    <td><select name="Tinh">
                        <option value="+">Addition</option>
                        <option value="-">Subtraction</option>
                        <option value="*">Multiple</option>
                        <option value="/">Division</option>
                    </select></td>
                </tr>
                <tr>
                    <td>Second operand:</td>
                    <td><input type="text" name="second" placeholder="0"></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <button type="submit" value="calculate">calculate</button>
                    </td>
                </tr>
            </table>
        </fieldset>
    </form>
</div>
</body>
</html>
