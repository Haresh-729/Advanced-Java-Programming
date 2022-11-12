<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Details</title>
    </head>
    <jsp:useBean id="EmpBeanObject" class="com.mycompany.employeeBeans" type="com.mycompany.employeeBeans"/>
    
    <body>
        <h1>Hello World!</h1>
        <%
            String first_name=request.getParameter("f_name");
            String last_name=request.getParameter("l_name");
            String designation=request.getParameter("posting");
        %>
        
        <jsp:setProperty name = "EmpBeanObject" property = "fname" value = "<%=first_name%>"/>
        <jsp:setProperty name = "EmpBeanObject" property = "lname" value = "<%=last_name%>" />
        <jsp:setProperty name = "EmpBeanObject" property = "post" value = "<%=designation%>" />
        <% out.print("First Name> "); %>
        <jsp:getProperty name = "EmpBeanObject" property ="fname" /><br><br>
        <% out.print("Last Name> "); %>
        <jsp:getProperty name = "EmpBeanObject" property ="lname" /><br><br>
        <% out.print("Designation> "); %>
        <jsp:getProperty name = "EmpBeanObject" property ="post" /><br><br>
    </body>
</html>
