<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head><title>${title}</title>
    <link  href="${pageContext.request.contextPath}/assets/css/style.css" rel="stylesheet"></head>
<body><h1>${title}</h1>
<div class="container">


    <form:form action="update2" modelAttribute="beverage"><label

        for="beverageID"><b>รหัส</b>::</label><form:input path="beverageID" disabled="true"/><br/>

    <label for="beverageName"><b>ชื่อเครื่องดื่ม</b>::</label><form:input
            path="beverageName"/><br/>


        <button type="submit">แก้ไข</button>
</form:form></div>


</body>
</html>