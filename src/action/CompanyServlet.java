package action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.CompanyService;
import service.MemberService;
import entity.Company;
import entity.Member;



public class CompanyServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO 自动生成的方法存根
		// TODO 自动生成的方法存根
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		CompanyService service=new CompanyService();
		String action =req.getParameter("action");
		if(action.equals("list")){
			try{
				List< Company> listCompany=service.find();
				System.out.println(listCompany);
				req.setAttribute("listCompany",listCompany);
				req.getRequestDispatcher("listCompany.jsp").forward(req, resp);
			}catch(Exception e){
				e.printStackTrace();
				
			}
			
		}
		else if(action.equals("updateview")){
			String CompanyName=req.getParameter("CompanyName");
			try{
				Company updateCompany=service.find1(CompanyName);
				req.setAttribute("updateCompany",updateCompany);
				req.getRequestDispatcher("/Updatecompany.jsp").forward(req, resp);
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
		else if(action.equals("update")){

			String CompanyName=req.getParameter("CompanyName");
			String CompanyKeeper=req.getParameter("CompanyKeeper");
			String CompanyAddress=req.getParameter("CompanyAddress");
			String Sales=req.getParameter("Sales");
			Integer MemberNumber=Integer.parseInt(req.getParameter("MemberNumber"));
			
			
			Company c=new Company();
			
			c.setCompanyKeeper(CompanyName);
			 c.setCompanyKeeper(CompanyKeeper);
			 c.setCompanyAddress(CompanyAddress);
			 c.setSales(Sales);
			 c.setMemberNumber(MemberNumber);
	          
			 CompanyService companyService=new CompanyService();
			 try{
				 
				 companyService.update(c);
				 resp.sendRedirect("company?action=list");
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

