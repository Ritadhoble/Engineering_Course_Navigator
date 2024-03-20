package ServletPackage;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import BeanPAckage.UserBean;
import DAOPackage.UpdateProfileDAO;
@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateProfileServlet extends HttpServlet
{
	@Override
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
    	Cookie c[]=req.getCookies();
    	if(c==null)
    	{
    		req.setAttribute("msg", "Session Expired...");
    		RequestDispatcher rd = req.getRequestDispatcher("ViewBranchSubjects.jsp");
            rd.forward(req, res);
    	}
    	else
    	{
    	    ServletContext sct=req.getServletContext();
    	    UserBean ub=(UserBean)sct.getAttribute("ubean");
    	    ub.setpWd(req.getParameter("pwd"));
    	    ub.setPhNo(Long.parseLong(req.getParameter("phno")));
    	    ub.setAddr(req.getParameter("address"));
    	    int k=new UpdateProfileDAO().update(ub);
    	    String fName=c[0].getValue();
    	    req.setAttribute("fname",fName);
    	    if(k>0)
    	    {
    	    	req.setAttribute("msg", "Your profile updated successfully...<br>");
    	    }
    	    RequestDispatcher rd=req.getRequestDispatcher("UpdateProfile.jsp");
    	    rd.forward(req, res);
    	}
    }
}
