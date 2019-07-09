package action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AdminDao;

public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		String AdminName=req.getParameter("AdminName");
		Integer AdminPwd=Integer.parseInt(req.getParameter("AdminPwd"));
	//	String Position=req.getParameter("Position");
		
		AdminDao adminDao=new AdminDao();
		
		try{
			if(adminDao.login(AdminName,AdminPwd))
			{
				resp.sendRedirect("index.html");
				
			}
			else
			{
				resp.getWriter().print("用户名或密码错误！");
				req.getRequestDispatcher("/login.html").forward(req, resp);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	
		
		
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		doGet(req,resp);
	}


}