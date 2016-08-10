<%--
  Created by IntelliJ IDEA.
  User: pazfernando
  Date: 5/4/16
  Time: 7:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>--%>
<html>
<head>
    <title>SE Demo Continuous Delivery</title>
</head>
<body>
<h3>Saludos Software Evolutivo</h3>
<h5>Listos para combatir!!! SEWorker</h5>

<%
    int life = 100;
    if (request.getAttribute("life") != null) {
        life = (Integer) request.getAttribute("life");
    }
%>

<form action="/test-jenkins/atacar">
    <input type="submit" value="Lanzar un puño (5)">
    <input type="hidden" name="life" value="<%=life%>">
</form>
<br/>
<span><%=life%> en vida.</span>

<span></span>
</body>
</html>
