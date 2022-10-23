<%-- 
    Document   : create
    Created on : Oct 22, 2022, 10:00:29 AM
    Author     : Faculty-1
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Create World! </h1>
        <h1>  </h1>
        <!-- EL -->
        <a href="edit">Edit</a><br>
        <c:set var="name" value="${sname}"/>
        <c:forEach items="${emp}" var="e">
            <div>
                <p>
                    <span>${e.name}</span>
                    <span>${e.salary}</span>
                    <span>${e.department}</span>
                </p>
            </div>
        </c:forEach>
        <c:out value="${name}"/>
        <c:out value="${sname}"/>
        
        
    <c:if test="${5==5}">
        <c:redirect url="edit.jsp"/>
    </c:if>
     
    </body>
</html>
