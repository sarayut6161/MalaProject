<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<tr>
    <td>
        <H1>เข้าสู่ระบบ</H1>
    </td>
</tr>
<tr>
    <td>
        <input type="textbox" value="USERNAME">
        <br>
        <input type="textbox" value="PASSWORD">
        <br>
    </td>
</tr>
<tr>
    <td>
        <input type="button" value="เข้าสู่ระบบ">
        <br>
    </td>
</tr>
<tr>
    <td>
        หรือหากท่านยังไม่ได้เป็นสมาชิกทางร้าน
        <input type="button" value="สมัครสมาชิก">
        <br>
    </td>
</tr>
<tr>
    <td>
        ผู้ใช้ทั่วไป--->   <a href="${pageContext.request.contextPath}/mala/list">คลิ๊ก </a>


    </td>z
</tr>
</body>
</html>