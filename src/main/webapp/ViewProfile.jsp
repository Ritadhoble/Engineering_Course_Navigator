<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="BeanPAckage.UserBean" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>ViewProfileJSP Page</title>
    <link rel="stylesheet" href="styles.css" />
    <style>
        .maindiv{
           margin-top:10%;
        }
    </style>
</head>
<body class="bg">
  <div class="maindiv">
   <div class="vpBox">
     <span class="vphd">Your Profile Details</span>
     <p class="stddetail">
	    <%
	        UserBean ub=(UserBean)application.getAttribute("ubean");
	        out.println("First Name:  "+ub.getfName()+"<br>"+"Last Name:  "+ub.getlName()+"<br>"+"Mail ID:  "+ub.geteMail()+
	        "<br>"+"Password:  "+ub.getpWd()+"<br>"+"Mobile Number:  "+ub.getPhNo()+"<br>"+"Address:  "+ub.getAddr()+"<br>");
	    %>
	   </p>
	   <div class="btndiv">
	      <a href="edit" class="btn">Edit</a>
	      <a href="dlt" class="btn">Delete</a>
	      <a href="index.html" class="btn" id="btn">>>Back To Home</a>
	  </div>
  </div>
  </div>
</body>
</html>
