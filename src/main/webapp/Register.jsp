<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RegisterJSP Page</title>
<link rel="stylesheet" href="styles.css">
</head>
<body class="bg">
<span class="rghd">
 <%
   String msg=(String) request.getAttribute("msg");
   out.println(msg);
 %>
 </span>
  <jsp:include page="login.html"/>
</body>
</html>