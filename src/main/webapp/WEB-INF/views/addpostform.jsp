<%--
  Created by IntelliJ IDEA.
  User: segsipogtandaineomaiteu
  Date: 2022/12/02
  Time: 10:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
</head>
<body>
<h1>Add New Schedule</h1>
<form action="addok" method="post">
    <table id="edit">
        <tr><td>모임명</td><td><input type="text" name="name"/></td></tr>
        <tr><td>작성자</td><td><input type="text" name="writer"/></td></tr>
        <tr><td>모임 이름</td><td><input type="text" name="organization"/></td></tr>
        <tr><td>모임 날짜</td><td><input type="date" name="start"/></td></tr>
    </table>
    <button type="button" onclick="location.href='list'">목록보기</button>
    <button type="submit">등록하기</button>
</form>
</body>
</html>
