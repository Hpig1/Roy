package action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;
import entity.Member;

public class RegisterServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO �Զ����ɵķ������
		// TODO �Զ����ɵķ������
				req.setCharacterEncoding("utf-8");
				resp.setContentType("text/html;charset=utf-8");
				
				
				
				Integer RoyId=Integer.parseInt(req.getParameter("RoyId"));
				String RoyName=req.getParameter("RoyName");
				Integer Money=Integer.parseInt(req.getParameter("Money"));
				String Password=req.getParameter("Password");
				String RoyType=req.getParameter("RoyType");
				Member member=new Member();
		     
		        member.setRoyId(RoyId);
		        member.setRoyName(RoyName);
		        member.setMoney(Money);
		        member.setPassword(Password);
		        member.setRoyType(RoyType);
				MemberDao  memberDao=new MemberDao();
				try{
					 memberDao.add( member);
					PrintWriter out=resp.getWriter();
					out.print("<h1>�û�����ע��ɹ���</h1>");
				}catch(Exception e){
					e.printStackTrace();
				}
			}

}
