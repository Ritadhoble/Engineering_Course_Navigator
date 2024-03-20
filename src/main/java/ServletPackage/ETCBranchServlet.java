package ServletPackage;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import BeanPAckage.SubjectBean;
import DAOPackage.ETCBranchDAO;
@SuppressWarnings("serial")
@WebServlet("/etc")
public class ETCBranchServlet extends HttpServlet
{
	 protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	    	String semester = req.getParameter("sem");
	        SubjectBean sb = new ETCBranchDAO().subDetails(semester);

	        if (sb != null) {
	            Cookie c[] = req.getCookies();
	            if (c == null) {
	                req.setAttribute("msg", "Session Expired...<br>");
	                RequestDispatcher rd = req.getRequestDispatcher("Home.jsp");
	                rd.forward(req, res);
	            } else {
	                String fName = c[0].getValue();
	                req.setAttribute("fname", fName);
	                ServletContext sct1 = req.getServletContext();
	                sct1.setAttribute("branch", "Electronics Telecommunications");
	                sct1.setAttribute("sbean", sb);
	                RequestDispatcher rd = req.getRequestDispatcher("ViewBranchSubjects.jsp");
	                rd.forward(req, res);
	            }
	        } else {
	            req.setAttribute("msg", "Invalid semester<br>");
	            RequestDispatcher rd = req.getRequestDispatcher("Home.jsp");
	            rd.forward(req, res);
	        }
	    }
}
