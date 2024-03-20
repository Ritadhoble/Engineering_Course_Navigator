package DAOPackage;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import BeanPAckage.DBConnection;
import BeanPAckage.UserBean;
public class LoginDAO 
{
    public UserBean ub=null;
    public UserBean logn(String eMail,String pWd)
    {
    	try
    	{
    		Connection con=DBConnection.getCon();
    		PreparedStatement ps=con.prepareStatement("select * from studentdetail where email=? and pwd=? ");
    		ps.setString(1, eMail);
    		ps.setString(2, pWd);
    		ResultSet rs=ps.executeQuery();
    		if(rs.next())
    		{
    			ub=new UserBean();
    			ub.setfName(rs.getString(1));
    			ub.setlName(rs.getString(2));
    			ub.seteMail(rs.getString(3));
    			ub.setpWd(rs.getString(4));
    			ub.setPhNo(rs.getLong(5));
    			ub.setAddr(rs.getString(6));
    		}
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
		return ub;
    	
    }
}

