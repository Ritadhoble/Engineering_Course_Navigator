<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="BeanPAckage.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EditProfile</title>
<link rel="stylesheet" href="styles.css" />
</head>
<body class="bg">
    <h4 class="ed">Edit Your Profile</h4>
    <div class="sub">
       <span class="name">
	       <%
		      String fName=(String)request.getAttribute("fname");
		      UserBean ub=(UserBean)application.getAttribute("ubean");
		      out.println("Profile belongs to : "+ub.getfName()+"<br><br>");
	      %>
      </span>
      <form action="update" method="post" class="frm">
         Password:   <input type="password" name="pwd" class="inp" value=<%=ub.getpWd()%> required><br><br>
         PhoneNo:   <input type="number" name="phno" class="inp" value=<%=ub.getPhNo()%> required><br><br>
         Address:   <input type="text" name="address" class="inp" value=<%=ub.getAddr()%> required><br><br>
         <input type="submit" value="UpdateProfile" class="upd">
     </form>
   </div>
</body>
</html>