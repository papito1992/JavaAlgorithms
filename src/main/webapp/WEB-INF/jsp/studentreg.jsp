<%--
  Created by IntelliJ IDEA.
  User: Simas
  Date: 2017-08-30
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link rel="stylesheet" href="webjars/bootstrap/4.0.0-beta/css/bootstrap.css">
    <title>Title</title>
</head>
<body>
<div class="container align-content-md-center">
    <div class=" col-md-6">
        <form:form method="POST" action="/addstudent">
            <div class="form-group">
                <form:label path="name" cssClass="form-control-label">Vardas</form:label>
                <form:input path="name" cssClass="form-control"/>
            </div>
            <div class="form-group">
                <form:label path="surname" cssClass="form-control-label">Pavarde</form:label>
                <form:input path="surname" cssClass="form-control"/>
            </div>
            <div class="form-group">
                <form:label path="schoolname" cssClass="form-control-label">Mokyklos pavadinimas</form:label>
                <form:input path="schoolname" cssClass="form-control"/>
            </div>
            <div class="form-group">
                <form:label path="parentinfo" cssClass="form-control-label">Tevu informacija</form:label>
                <form:input path="parentinfo" cssClass="form-control"/>
            </div>
            <div class="form-group">
                <form:label path="phone" cssClass="form-control-label">Telefonas</form:label>
                <form:input path="phone" cssClass="form-control"/>
            </div>
            <div class="form-group">
                <form:label path="email" cssClass="form-control-label">El. pasto adresas</form:label>
                <form:input path="email" cssClass="form-control"/>
            </div>
            <div class="form-group">
                <form:label path="moreinfo" cssClass="form-control-label">Papildoma informacija</form:label>
                <form:input path="moreinfo" cssClass="form-control"/>
            </div>
            <div class="form-group">
                <form:label path="course" cssClass="form-control-label">Kelintas kursas</form:label>
                <form:input path="course" cssClass="form-control"/>
            </div>


            <input class="btn btn-dark" type="submit" name="Submit"/>

        </form:form>
    </div>
</div>
</body>
</html>
