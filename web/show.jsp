<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Список пользователей</title>
</head>
<body>
<table border="2">
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Kind</td>
        <td>Age</td>
        <td>Metods</td>
    </tr>
    <c:forEach items="${Animals}" var = "user">
        <tr>
            <td>${user.getId()}</td>
            <td>${user.getName()}</td>
            <td>${user.getKind()}</td>
            <td>${user.getAge()}</td>
            <td>
                <form action = "User.jsp" method="post">
                    <input type="hidden" name="id" value="${user.getId()}">
                    <input type="hidden" name="name" value="${user.getName()}">
                    <input type="hidden" name="kind" value="${user.getKind()}">
                    <input type="hidden" name="age" value="${user.getAge()}">
                    <input type="submit" value="Изменить" style="float:left">
                </form>
                <form action="delete.jsp" method="post">
                    <input type="hidden" name="id" value="${user.getId()}">
                    <input type="submit" value="Удалить" style="float:left">
                </form></td>
        </tr>
    </c:forEach>
</table>

<form action = "addUser.jsp">
    <input type="submit" value="Добавить нового пользователя">
</form>
</body>
</html>