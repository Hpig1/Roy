package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import service.MemberService;
import entity.Member;

public class MemberServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO 自动生成的方法存根
		// TODO 自动生成的方法存根
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		MemberService service=new MemberService();
		String action =req.getParameter("action");
		if(action.equals("list")){
			try{
				List< Member> listMember=service.find();
				System.out.println(listMember);
				req.setAttribute("listMember",listMember);
				req.getRequestDispatcher("listMember.jsp").forward(req, resp);
			}catch(Exception e){
				e.printStackTrace();
				
			}
			
		}
		else if(action.equals("check")){
			String RoyId=req.getParameter("RoyId");
			try{
				Member checkMember=service.find1(RoyId);
				req.setAttribute("checkMember", checkMember);
			
				req.getRequestDispatcher("checkMember.jsp").forward(req, resp);
			}catch(Exception e){
				e.printStackTrace();
			}
			}
		
		else if(action.equals("updateview")){
			String RoyId=req.getParameter("RoyId");
			try{
				Member updateMember=service.find1(RoyId);
				req.setAttribute("updateMember",updateMember);
				req.getRequestDispatcher("updateMember.jsp").forward(req, resp);
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
		else if(action.equals("update")){
			Integer RoyId=Integer.parseInt(req.getParameter("RoyId"));
			String RoyName=req.getParameter("RoyName");
			Integer Money=Integer.parseInt(req.getParameter("Money"));
			
			String Password=req.getParameter("Password");
			String RoyType=req.getParameter("RoyType");
			
			
			Member c=new Member();
			 c.setRoyId(RoyId);
			 c.setRoyName(RoyName);
			 c.setMoney(Money);
			 c.setPassword(Password);
			 c.setRoyType(RoyType);
	         System.out.println(c);
			 MemberService memberService=new MemberService();
			 try{
				 
				 memberService.update(c);
				 resp.sendRedirect("find?action=list");
			 }catch(Exception e){
				 e.printStackTrace();
			 }
		}
		
		else if(action.equals("delete")){
			String RoyId=req.getParameter("RoyId");
			 try{
				 
				service.delete(RoyId);
			 resp.sendRedirect("find?action=list");
			 }catch(Exception e){
				 e.printStackTrace();
			 }
		}

	}
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO 自动生成的方法存根
		doPost(req, resp);
	}
}
