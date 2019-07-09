package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Company;
import entity.Member;


public class CompanyDao {
	private static Connection conn; 
	private  PreparedStatement pre;//预编译处理
	private ResultSet rs;//接受查询信息
	private Statement  state;
	
	public List<Company> find() throws SQLException {
		// TODO 自动生成的方法存根
		List<Company> list=new ArrayList<Company>();
		String sql="select * from t_company";
		conn=DBConn.getConnection();
		state=conn.createStatement();
		rs=state.executeQuery(sql);
		Company c=null;
	while(rs.next()){
	 c=new Company();
	 c.setCompanyName(rs.getString("CompanyName"));
	 c.setCompanyKeeper(rs.getString("CompanyKeeper"));
	 c.setCompanyAddress(rs.getString("CompanyAddress"));
	 c.setSales(rs.getString("Sales"));
	 c.setMemberNumber(rs.getInt("MemberNumber"));
	 list.add(c);
	}
	
	
	rs.close();
	state.close();
	conn.close();
	return list;
	}
	
	public Company find1(String CompanyName)  throws SQLException {
		conn=DBConn.getConnection();
		String sql="select * from t_company where CompanyName=?";
		pre=conn.prepareStatement(sql);
		pre.setString(1, CompanyName);
		rs=pre.executeQuery();
		Company c=null;
	        if(rs.next()){
	            c=new Company();
	    
	            c.setCompanyKeeper(rs.getString("CompanyKeeper"));
	            c.setCompanyAddress(rs.getString("CompanyAddress"));
	            c.setSales(rs.getString("Sales"));
	            c.setMemberNumber(rs.getInt("MemberNumber"));
	            
	            
	           }
	           rs.close();
	           conn.close();
			return c;

	}
	
	public void update(Company c)  throws Exception {
		// TODO 自动生成的方法存根
		    	conn=DBConn.getConnection();
		    	String sql="update t_company set CompanyKeeper=?,CompanyAddress=?,Sales=?,MemberNumber=? where CompanyName=?";
		    	pre=conn.prepareStatement(sql);
		     	
		    	
		    	pre.setString(1, c.getCompanyKeeper());
		    	pre.setString(2, c.getCompanyAddress());
		    	pre.setString(3, c.getSales());
		    	pre.setInt(4, c.getMemberNumber());
		    	pre.setString(5, c.getCompanyName());
		      	
		      	pre.executeUpdate();
		    	pre.close();
		    	conn.close();
	}

	

}
