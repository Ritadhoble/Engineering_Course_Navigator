package DAOPackage;
import java.sql.*;

import BeanPAckage.DBConnection;
import BeanPAckage.UserBean;
public class DeleteProfileDAO 
{
	public int k=0;
	public int delete(UserBean ub)
	{
		try
    	{
			Connection con=DBConnection.getCon();
    		PreparedStatement ps=con.prepareStatement("Delete from studentdetail where email=?");
    		ps.setString(1, ub.geteMail());
    		k=ps.executeUpdate();
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
		return k;
	}
}
