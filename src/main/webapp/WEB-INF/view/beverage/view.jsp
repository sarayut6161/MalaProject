<%--
  Created by IntelliJ IDEA.
  User: saray
  Date: 11/6/2022
  Time: 10:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head><title>${title}</title></head>
<body><h1>${title}</h1>
<div class="container">
    <div class="container">
        <nav>
            <ul>
                <li><a href="update-form2">แก้ไข</a></li>
            </ul>
        </nav>
        <p>
            <b>รหัสเครื่องดื่ม::</b><span>${beverage.beverageID}</span><br/>
            <b>ชื่อ::</b><span>${beverage.beverageName}</span><br/>
            <b>ราคา::</b><span>${beverage.bprice}</span><br/>

        </p></div>
</div>
</body>
</html>