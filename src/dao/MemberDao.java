package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;








import entity.Member;

public class MemberDao {
	private static Connection conn; 
	private  PreparedStatement pre;//预编译处理
	private ResultSet rs;//接受查询信息
	private Statement  state;
	public  int add(Member member) throws SQLException{
		// TODO 自动生成的方法存根
		 String sql="insert t_member values('" + member.getRoyId()+"','" 
				 		+ member.getRoyName()+"','" + member.getMoney()+"','" 
				 		+ member.getPassword()+"','" + member.getRoyType()+"')";
					 
					 conn=DBConn.getConnection();
					  state=conn.createStatement();
					 int result=state.executeUpdate(sql);
					 state.close();
					 conn.close();
					return result;
					}
	
	public List<Member> find() throws SQLException {
		// TODO 自动生成的方法存根
		List<Member> list=new ArrayList<Member>();
		String sql="select * from t_member";
		conn=DBConn.getConnection();
		state=conn.createStatement();
		rs=state.executeQuery(sql);
		Member c=null;
	while(rs.next()){
	 c=new Member();
	 c.setRoyId(rs.getInt("RoyId"));
	 c.setRoyName(rs.getString("RoyName"));
	 c.setMoney(rs.getInt("Money"));
	 c.setPassword(rs.getString("Password"));
	 c.setRoyType(rs.getString("RoyType"));
	 list.add(c);
	}
	
	
	rs.close();
	state.close();
	conn.close();
	return list;
	}
	
	public Member find1(String RoyId)  throws SQLException {
		conn=DBConn.getConnection();
		String sql="select * from t_member where RoyId=?";
		pre=conn.prepareStatement(sql);
		pre.setString(1, RoyId);
		rs=pre.executeQuery();
		Member c=null;
	        if(rs.next()){
	            c=new Member();
	    
	            c.setRoyName(rs.getString("RoyName"));
	            c.setMoney(rs.getInt("Money"));
	            c.setPassword(rs.getString("Password"));
	            c.setRoyType(rs.getString("RoyType"));
	            
	            
	           }
	           rs.close();
	           conn.close();
			return c;

	}
	
	public void update(Member c)  throws Exception {
		// TODO 自动生成的方法存根
			   
		    	conn=DBConn.getConnection();
		    	String sql="update t_member set RoyName=?,Money=?,Password=?,RoyType=? where RoyId=?";
		    	pre=conn.prepareStatement(sql);	     	
		    	pre.setString(1, c.getRoyName());
		    	pre.setInt(2, c.getMoney());
		    	pre.setString(3, c.getPassword());
		    	pre.setString(4, c.getRoyType());
		    	pre.setInt(5, c.getRoyId());
		    	int e = pre.executeUpdate();
		    	System.out.println(e);
		    	pre.close();
		    	conn.close();
				
	}


	public Integer delete(String RoyId) throws SQLException{
		// TODO 自动生成的方法存根
		conn=DBConn.getConnection();
		String sql="Delete from t_member where RoyId=?";
		pre=conn.prepareStatement(sql);
		pre.setString(1,RoyId );
		int count=pre.executeUpdate();
		pre.close();
		conn.close();
		return count;	
	}

	
}
