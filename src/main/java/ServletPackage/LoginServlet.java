package ServletPackage;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import BeanPAckage.UserBean;
import DAOPackage.LoginDAO;
@SuppressWarnings("serial")
@WebServlet("/log")
public class LoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		UserBean ub=new LoginDAO().logn(req.getParameter("email"),req.getParameter("pwd"));
		if(ub==null)
		{
			req.setAttribute("msg", "Invalid Login process...<br>");
			RequestDispatcher rd=req.getRequestDispatcher("Home.jsp");
			rd.forward(req, res);
		}
		else
		{
			ServletContext sct=req.getServletContext();
			sct.setAttribute("ubean", ub);
			Cookie ck=new Cookie("fname",ub.getfName());
			res.addCookie(ck); 
			RequestDispatcher rd=req.getRequestDispatcher("Login.jsp");
			rd.forward(req, res);
		}
	}
}







