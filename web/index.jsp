<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <h1>Hello World!</h1>
    </body>

    <%-- This is  a JSP Comment --%>


    <%! String s = "name";%>



    <% String ss = "new";
        if (s.equals(ss)) { %>
    <h1>I am inside the if block</h1>
    <%} else {%>
    <h1>I am inside the else block</h1>
    <%}%>


    <%= new java.util.Date()%>

    <h1>${ss}</h1>

    <%= request.getRequestURL()%>
    <%= request.getPathInfo()%>
    <jsp:include page="footer.jsp"></jsp:include>
    
    <jsp:scriptlet>
        String s = "Hello";
    </jsp:scriptlet>
    
    <jsp:useBean id="person" class="com.web.init.Person" scope="application"></jsp:useBean>
    
    <%= person.getName() %>
    
    ${person.name}
    
    <jsp:setProperty name="person" property="name" value="Mr. ABCDEF"></jsp:setProperty>
    ${person.getName()}
    <jsp:getProperty name="person" property="name"></jsp:getProperty>
    
    <br>
    <h1>Expression language</h1><br>
    
    ${person['name']}
    ${2 eq 2}
 
     
</html>
