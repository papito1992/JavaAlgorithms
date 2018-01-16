<%--
  Created by IntelliJ IDEA.
  User: Simas
  Date: 2017-08-30
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="webjars/bootstrap/4.0.0-beta/css/bootstrap.css">
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
        <c:forEach var="student" items="${liststudent}">
            <tr>
                <th scope="row">${student.getId()}</th>
                <td>${student.getName()}</td>
                <td>${student.getSurname()}</td>
                <td>${student.schoolname}</td>
                <td>${student.parentinfo}</td>
                <td>${student.phone}</td>
                <td>${student.email}</td>
                <td>${student.moreinfo}</td>
                <td>${student.course}</td>
            </tr>




        </c:forEach>
        </tbody>
    </table>
    <script type="text/javascript" src="webjars/jquery/1.11.1/jquery.js"/>
    <script type="text/javascript" src="webjars/bootstrap/4.0.0-alpha.6-1/js/bootstrap.js"/>

</div>
</body>
</html>
