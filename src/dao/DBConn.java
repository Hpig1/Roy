package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class DBConn
{
  private static final String URL = "jdbc:mysql://localhost:3306 autoReconnect=true";
  private static final String UNAME = "root";
  private static final String PWD = "731137";
 
  private static Connection conn = null;
 
  public static Connection getConnection()
  {
    try
    {
      // 1.加载驱动程序
      Class.forName("com.mysql.jdbc.Driver");
      // 2.获得数据库的连接
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/roymanagementdb","root","731137");
    }
    catch (ClassNotFoundException e)
    {
      e.printStackTrace();
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
    return conn;
  }
 
  
}

//import java.sql.Connection;
//import java.sql.DriverManager;

//public class DBConn {
	// public static Connection getConnection(){
    	// Connection conn=null;
    	 //try {			    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");			   
    	 //conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1039;DataBaseName=RoyManagemrntDB","root","731137");
		//} catch (Exception e) {
			//e.printStackTrace();
		//}
		 //return conn;
    // }
//}
