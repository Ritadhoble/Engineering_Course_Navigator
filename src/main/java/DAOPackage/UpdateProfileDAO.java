package DAOPackage;
import java.sql.*;

import BeanPAckage.DBConnection;
import BeanPAckage.UserBean;
public class UpdateProfileDAO 
{
   public int k=0;
   public int update(UserBean ub)
   {
	   try
	   {
		   Connection con=DBConnection.getCon();
		   PreparedStatement ps=con.prepareStatement("Update studentdetail set pwd=?,phno=? ,address=? where email=?");
		   ps.setString(1, ub.getpWd());
		   ps.setLong(2, ub.getPhNo());
		   ps.setString(3, ub.getAddr());
		   ps.setString(4, ub.geteMail());
		  		    
		   k=ps.executeUpdate();

	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   return k;
   }
}
