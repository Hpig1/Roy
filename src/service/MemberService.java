package service;

import java.sql.SQLException;
import java.util.List;






import dao.MemberDao;
import entity.Member;

public class MemberService {
	
	public List<Member> find() throws SQLException {
		// TODO 自动生成的方法存根
		MemberDao dao=new MemberDao();
    	 return dao.find();
	}

	public Member find1(String RoyId) throws SQLException  {
		// TODO Auto-generated method stub
		MemberDao dao=new MemberDao();
   	    return dao.find1(RoyId);
	}

	public void update(Member c) throws Exception {
		// TODO Auto-generated method stub
		MemberDao dao=new MemberDao();
		dao. update(c);
	}



	public int delete(String RoyId) throws SQLException {
		// TODO Auto-generated method stub
		MemberDao dao=new MemberDao();
		return (Integer) dao.delete(RoyId);
	}

}
