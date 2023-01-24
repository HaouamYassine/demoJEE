<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Akela
  Date: 23/01/2023
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User</title>
</head>

<body>
<h1> User</h1>
<div class="container">
  <div class="row">
    <div class="col-8 offset-2">

     <c:forEach items="${users}" var="user">
       <p>${user.username} - ${user.firstname} -  ${user.lastname}</p>

     </c:forEach>

    </div>
  </div>
</div>
</body>
</html>
