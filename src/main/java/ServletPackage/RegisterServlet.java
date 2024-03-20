package ServletPackage;
import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import BeanPAckage.UserBean;
import DAOPackage.RegisterDAO;
@SuppressWarnings("serial")
@WebServlet("/reg")
public class RegisterServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
    	UserBean ub=new UserBean();
    	ub.setfName(req.getParameter("fname"));
    	ub.setlName(req.getParameter("lname"));
    	ub.seteMail(req.getParameter("email"));
    	ub.setpWd(req.getParameter("pwd"));
    	ub.setPhNo(Long.parseLong(req.getParameter("phno")));
    	ub.setAddr(req.getParameter("address"));
    	
    	int k=new RegisterDAO().register(ub);
    	if(k>0)
    	{
    		req.setAttribute("msg", "Registered successfully...<br><br>");
    		RequestDispatcher rd=req.getRequestDispatcher("Register.jsp");
    		rd.forward(req, res);
    	}
    }
}
