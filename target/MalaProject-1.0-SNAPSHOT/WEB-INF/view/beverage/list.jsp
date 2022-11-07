<%--
  Created by IntelliJ IDEA.
  User: saray
  Date: 11/6/2022
  Time: 10:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>${title}</title></head>
<body><h1>${title}</h1>
<div class="container">
    <table>
        <thead>
        <tr>
            <th>รหัสสินค้า</th>
            <th>ชื่อสินค้า</th>
            <th>ราคา</th>
        </tr>
        </thead>
        <tbody><c:forEach var="beverage" items="${beverage}">
            <tr>
                <td><a href="${beverage.beverageID}/view">${beverage.beverageID}</a></td>
                <td>${beverage.beverageName}</td>
                <td>${beverage.bprice}</td>
            </tr>
        </c:forEach></tbody>
    </table>
</div>
</body>
</html>

