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

    	
        <p>
           <img src="images/shu.gif" /></span></span>&nbsp;
           <a href="addMember.html" style="color:#000000"><img src="images/ico4.gif" width="17" height="17">新增</a>
       </p>

    <div class="clear"></div>
    <div class=" mainbox eXtremeTable">
    	<table border="0" cellpadding="0" cellspacing="0" id="CmsSiteList_table" class="table1 tableRegion" width="100%">
        	<tr>
            	<th>会员号</th>
                <th>会员姓名</th>
                <th>余额</th>
                <th>密码</th>
                <th>会员等级</th>
                <th>操作</th>
            </tr>
            
            <%
            List<Member> list = (List<Member>)request.getAttribute("listMember");
                for(Member member : list){
            
             %>
         <tr>
              <td height="30" align="center" ><span><%=member.getRoyId() %></span></td>
              <td height="30" align="center" ><%=member.getRoyName() %></td>
              <td height="30" align="center" ><%=member.getMoney() %></td>
              <td height="30" align="center" ><%=member.getPassword() %></td>
              <td height="30" align="center" ><%=member.getRoyType()%></td>
              <td height="30" align="center" ><a
                   href="/Bysj/find?action=check&RoyId=<%=member.getRoyId() %>">【查看】</a>
                <a href="/Bysj/find?action=updateview&RoyId=<%=member.getRoyId() %>">【修改】</a>
                <a href="/Bysj/find?action=delete&RoyId=<%=member.getRoyId() %>">【删除】</a>
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

