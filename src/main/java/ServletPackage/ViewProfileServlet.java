package ServletPackage;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import BeanPAckage.UserBean;

import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession session = req.getSession();
        UserBean ub = (UserBean) session.getAttribute("ubean");

        Cookie c[]=req.getCookies();
    	if(c==null)
    	{
    		req.setAttribute("msg", "Session Expired...");
    		RequestDispatcher rd = req.getRequestDispatcher("ViewBranchSubjects.jsp");
            rd.forward(req, res);
    		
    	} else 
    	{
    		String fName=c[0].getValue();
    		req.setAttribute("fname",fName);
            req.setAttribute("ubean", ub);
            RequestDispatcher rd = req.getRequestDispatcher("ViewProfile.jsp");
            rd.forward(req, res);

        }
    }
}
