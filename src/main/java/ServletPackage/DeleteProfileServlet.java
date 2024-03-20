package ServletPackage;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import BeanPAckage.UserBean;
import DAOPackage.DeleteProfileDAO;

@SuppressWarnings("serial")
@WebServlet("/dlt")

public class DeleteProfileServlet extends HttpServlet
{
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Cookie c[] = req.getCookies();
        if (c == null) 
        {
            req.setAttribute("msg", "Session Expired...");
            RequestDispatcher rd = req.getRequestDispatcher("ViewBranchSubjects.jsp");
            rd.forward(req, res);
        }
        else 
        {
            String fName = c[0].getValue();
            req.setAttribute("fname", fName);
            ServletContext sct = req.getServletContext();
            UserBean ub = (UserBean)sct.getAttribute("ubean");

            int k = new DeleteProfileDAO().delete(ub);
            if (k > 0) {
                req.setAttribute("msg", "Your profile deleted successfully.");
            } 
            else {
                req.setAttribute("msg", "Failed to delete your profile.");
            }

            req.getRequestDispatcher("DeleteProfile.jsp").forward(req, res);
        }
    }
}
