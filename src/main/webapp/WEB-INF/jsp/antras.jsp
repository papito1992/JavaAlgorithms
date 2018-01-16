<%--
  Created by IntelliJ IDEA.
  User: Simas
  Date: 2017-08-28
  Time: 09:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Pavadinimas</title>
</head>
<body>


<h1>${pavadinimas}</h1>

<p>${par1}</p>
<p>${par2}</p>
<h3><c:out value="${par3}"/></h3>

<c:out value="${sk1}"/>
<c:out value="${sk2}"/>
<c:out value="${sk3}"/>

<h1><c:if test="${sk1+sk2>sk3}">pirmu dvieju suma yra DIDESNE nei trecio skaiciaus</c:if></h1>
<h1><c:if test="${sk1+sk2<=sk3}">pirmu dvieju suma yra MAZESNE nei trecio skaiciaus</c:if></h1>

</body>
</html>
