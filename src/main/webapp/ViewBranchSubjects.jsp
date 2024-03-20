<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
    import="BeanPAckage.SubjectBean,BeanPAckage.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ViewBranchSubjectJSP Page</title>
<link rel="stylesheet" href="styles.css" />
</head>
<body class="bg">
      <div class="subBox">
          <span class="stdname">
             <%
	             SubjectBean sb = (SubjectBean)application.getAttribute("sbean");
	             UserBean ub=(UserBean)application.getAttribute("ubean");
	             ServletContext sct1 = request.getServletContext();
	             out.println("Name of student : <u>"+ub.getfName()+"</u><br>");
	             
             %>
          </span>
          <span class="semsubname">
          <%
            out.println("Branch: " +sct1.getAttribute("branch")+ "<br>");
            out.println("Semester Selected: " + sb.getSem() + "<br>");
            out.println("Subjects:");
          %>
         </span>
         <p class="subname">
             <%
	            out.println("1. "+sb.getSub1() +"<br>" +"2. "+ sb.getSub2() +"<br>" +"3. "+ sb.getSub3() +"<br>" + 
	            "4. "+sb.getSub4() +"<br>" +"5. "+ sb.getSub5() +"<br>"+"6. "+sb.getSub6());
             %>
         </p>
      </div>
      <jsp:include page="branchDetail.html"/>
</body>

</html>