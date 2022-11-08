<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head><title>${title}</title></head>
<body align="center"><h1>${title}</h1>
<div class="container">


    <form:form action="update" modelAttribute="mala"><label

            for="malaID"><b>รหัส</b>::</label><form:input path="malaID" disabled="true"/><br/>

        <label for="malaname"><b>ชื่อเครื่องดื่ม</b>::</label><form:input
                path="malaname"/><br/>


        <button type="submit">แก้ไข</button>
    </form:form></div>
</body>
</html>


