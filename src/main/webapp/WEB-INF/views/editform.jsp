<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: segsipogtandaineomaiteu
  Date: 2022/12/02
  Time: 10:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit Schedule</h1>
<form:form modelAttribute="u" method="POST" action="../editok">
    <form:hidden path="seq" />
        <table id="edit">
            <tr><td>모임명</td><td><form:input path="name"/></td></tr>
            <tr><td>작성자</td><td><form:input path="writer"/></td></tr>
            <tr><td>모임 이름</td><td><form:input path="organization"/></td></tr>
            <tr><td>모임 날짜</td><td><form:input path="start"/></td></tr>
        </table>
        <input type="submit" value="Edit"/>
        <input type="button" value="Cancel" onclick="history.back()"/>
</form:form>
</body>
</html>
