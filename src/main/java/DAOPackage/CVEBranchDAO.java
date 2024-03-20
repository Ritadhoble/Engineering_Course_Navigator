package DAOPackage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import BeanPAckage.DBConnection;
import BeanPAckage.SubjectBean;
public class CVEBranchDAO 
{
	public SubjectBean sb=null;
    public SubjectBean subjDetl(String sem)
    {
    	try
    	{
    		Connection con=DBConnection.getCon();
    		PreparedStatement ps=con.prepareStatement("select * from CVE where sem=?");
    		ps.setString(1,sem);
    		
    		ResultSet rs=ps.executeQuery();
    		if(rs.next())
    		{
    			sb=new SubjectBean();
    			sb.setSem(rs.getString(1));
    			sb.setSub1(rs.getString(2));
    			sb.setSub2(rs.getString(3));
    			sb.setSub3(rs.getString(4));
    			sb.setSub4(rs.getString(5));
    			sb.setSub5(rs.getString(6));
    			sb.setSub6(rs.getString(7));
    		}
    		 else {
                 // Handle case where no results are found for the semester
                 System.out.println("No subjects found for semester: " + sem);
             }
    	}
    	catch(Exception e)
    	{
    	   e.printStackTrace();
    	}
		return sb;
    }

}
