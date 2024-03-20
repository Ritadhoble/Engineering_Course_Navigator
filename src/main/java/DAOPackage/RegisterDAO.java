package DAOPackage;
import java.sql.Connection;
import java.sql.PreparedStatement;

import BeanPAckage.DBConnection;
import BeanPAckage.UserBean;
public class RegisterDAO
{
   public int k=0;
   public int register(UserBean ub)
   {
	   try
	   {
		   Connection con=DBConnection.getCon();
		   PreparedStatement ps=con.prepareStatement("insert into studentdetail values(?,?,?,?,?,?)");
		   ps.setString(1, ub.getfName());
		   ps.setString(2, ub.getlName());
		   ps.setString(3, ub.geteMail());
		   ps.setString(4, ub.getpWd());
		   ps.setLong(5, ub.getPhNo());
		   ps.setString(6, ub.getAddr());
			   
		   k=ps.executeUpdate();
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	return k;
   }
}
