<%--
  Created by IntelliJ IDEA.
  User: Simas
  Date: 2017-08-28
  Time: 11:08
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
        <th>Name</th>
        <th>Mail</th>
        <th>Address</th>
    </tr>
    </thead>
    <tbody>
<c:forEach var="person" items="${persons}">
    <tr>
        <th scope="row">${person.id}</th>
        <td>${person.name}</td>
        <td>${person.email}</td>
        <td>${person.address}</td>
    </tr>




</c:forEach>
    </tbody>
</table>
    <script type="text/javascript" src="webjars/jquery/1.11.1/jquery.js"/>
    <script type="text/javascript" src="webjars/bootstrap/4.0.0-alpha.6-1/js/bootstrap.js"/>

</div>
</body>
</html>
