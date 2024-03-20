<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="BeanPAckage.UserBean" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginJSP Page</title>
<link rel="stylesheet" href="styles.css" />
</head>
<body class="bg">
     <span class="wlchd">
     <%
     UserBean ub=(UserBean)application.getAttribute("ubean");
      out.println("Welcome dear student :  "+ub.getfName()+"<br>");
    %>
    </span>
    <jsp:include page="branchDetail.html"/>
</body>
</html>