package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDao {
	Connection conn;
	PreparedStatement pstmt = null ;
	ResultSet rs = null;
	
	public  boolean login(String AdminName,Integer AdminPwd)
	throws SQLException
	{
		conn=DBConn.getConnection();
		String sql="select * from t_admin where AdminName=?and AdminPwd=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,AdminName);
		//pstmt.setString(2,Position);
		pstmt.setInt(2,AdminPwd);
		rs=pstmt.executeQuery();
		if(rs.next())
			return true;
		else
			return false;
	}
}
