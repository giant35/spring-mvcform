<%-- 
    Document   : login
    Created on : 2017-8-31, 18:54:34
    Author     : sihai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>登录</h1>
        <form:form modelAttribute="user">
            <form:input path="name" />
            <form:password path="pwd" />
            <input type="submit" />
            ${msg}            
        </form:form>
    </body>
</html>
