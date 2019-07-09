package service;

import java.sql.SQLException;
import java.util.List;

import dao.CompanyDao;

import entity.Company;


public class CompanyService {

		public List<Company> find() throws SQLException {
			// TODO Auto-generated method stub
			CompanyDao dao=new CompanyDao();
	    	 return dao.find();
		}

		public void update(Company c) throws Exception {
			// TODO Auto-generated method stub
			CompanyDao dao=new CompanyDao();
			dao. update(c);
		}

		public Company find1(String CompanyName) throws SQLException {
			CompanyDao dao=new CompanyDao();
			return dao. find1(CompanyName);
		}

	}



