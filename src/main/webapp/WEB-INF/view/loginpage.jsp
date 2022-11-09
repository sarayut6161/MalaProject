<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link  href="${pageContext.request.contextPath}/assets/css/style.css" rel="stylesheet">
</head>
<body align="center">
<form:form name="send" id="sd" method="post" action="${pageContext.request.contextPath}/Login//loginDB" modelAttribute="login">
<tr>
    <td>
        <H1>เข้าสู่ระบบ</H1>
    </td>
</tr>
<tr>
    <td>
        <form:input type="textbox" value="USERNAME" name="username" path="username"/>
        <br>
        <form:input type="textbox" value="PASSWORD" name="password" path="password"/>
        <br>
    </td>
</tr>
<tr>
    <td>
        <input type="submit" value="เข้าสู่ระบบ" id="lg">
        <br>
    </td>
</tr>
<tr>
    <td>
        หรือหากท่านยังไม่ได้เป็นสมาชิกทางร้าน
        <input type="button" value="สมัครสมาชิก" id="re">
        <br>
    </td>
</tr>
<tr>
    <td>
        ผู้ใช้ทั่วไป--->   <a href="${pageContext.request.contextPath}/mala/list">คลิ๊ก </a>


    </td>
</tr>
</form:form>
</body>
</html>