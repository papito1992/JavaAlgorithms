<%--
  Created by IntelliJ IDEA.
  User: Simas
  Date: 2017-08-30
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link rel="stylesheet" href="webjars/bootstrap/4.0.0-beta/css/bootstrap.css">
    <title>Title</title>
</head>
<body>
<div class="container">
    <table class="table table-striped table-inverse">
        <thead>
        <tr>
            <th>ID</th>
            <th>Vardas</th>
            <th>Pavarde</th>
            <th>Mokyklos pavadinimas</th>
            <th>Tevu informacija</th>
            <th>Telefonas</th>
            <th>El. pastas</th>
            <th>Informacija</th>
            <th>Kursas</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="students" items="${student}">
            <tr>
                <th scope="row">${students.id}</th>
                <td>${students.name}</td>
                <td>${students.surname}</td>
                <td>${students.schoolname}</td>
                <td>${students.parentinfo}</td>
                <td>${students.phone}</td>
                <td>${students.email}</td>
                <td>${students.moreinfo}</td>
                <td>${students.course}</td>
            </tr>




        </c:forEach>
        </tbody>
    </table>
    <script type="text/javascript" src="webjars/jquery/1.11.1/jquery.js"/>
    <script type="text/javascript" src="webjars/bootstrap/4.0.0-alpha.6-1/js/bootstrap.js"/>

</div>

</body>
</html>
