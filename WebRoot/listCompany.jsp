<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="java.util.*"%>
<%@page import="entity.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<!-- saved from url=(0070)http://192.168.2.36:8011/cms/info/index.do -->
<HTML xmlns="http://www.w3.org/1999/xhtml">
<HEAD>
<TITLE>会员管理系统</TITLE>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
<link href="css/public.css" rel="stylesheet" type="text/css">
<link href="css/style.css" rel="stylesheet" type="text/css">
<meta name=generator content="MSHTML 8.00.6001.18939">
</HEAD>
<body style="background:#DFE8F6;">
<div class="box">

    <div class="clear"></div>
    <div class=" mainbox eXtremeTable">
    	<table border="0" cellpadding="0" cellspacing="0" id="CmsSiteList_table" class="table1 tableRegion" width="100%">
        	<tr>
            	<th>店铺名</th>
                <th>店铺老板</th>
                <th>店铺地址</th>
                <th>店铺销售额</th>
                <th>会员总数</th>
                <th>操作</th>
            </tr>
            
            <%
            List<Company> list = (List<Company>)request.getAttribute("listCompany");
                for(Company company : list){
            
             %>
         <tr>
              <td height="30" align="center" ><span><%=company.getCompanyName() %></span></td>
              <td height="30" align="center" ><%=company.getCompanyKeeper() %></td>
              <td height="30" align="center" ><%=company.getCompanyAddress() %></td>
              <td height="30" align="center" ><%=company.getSales() %></td>
              <td height="30" align="center" ><%=company.getMemberNumber()%></td>
              <td height="30" align="center" >
                <a href="/Bysj/company?action=updateview&CompanyName=<%=company.getCompanyName() %>">【修改】</a>
                
                   </td>
         </tr>
         
      
          <%
               }
           %>
       
	</table>
</div>
    <div class="footer">
    	<div class="left" style="_margin-top:3px;">
        	<a href="###"><img src="images/left1.gif" /></a>
            <a href="###"><img src="images/left2.gif" /></a>
            <img src="images/shu.gif" />
            <span>
            	第<input type="text" value="" style="width:20px;" />页，共1页
            </span>
            <img src="images/shu.gif" />
            <a href="###"><img src="images/right1.gif" /></a>
            <a href="###"><img src="images/right2.gif" /></a>
            <img src="images/shu.gif" />
            <a href="###"><img src="images/new.gif" /></a>
            <img src="images/shu.gif" /></div>
        <div class="right mr8">显示第 1-8 条，共 3333条</div>
    </div>
</div>
	


</body>
</html>
