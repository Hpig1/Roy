<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="entity.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<!-- saved from url=(0070)http://192.168.2.36:8011/cms/info/index.do -->
<HTML xmlns="http://www.w3.org/1999/xhtml">
<HEAD>
<TITLE>信息查看</TITLE>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
<link href="css/public.css" rel="stylesheet" type="text/css">
<link href="css/style.css" rel="stylesheet" type="text/css">
<meta name=generator content="MSHTML 8.00.6001.18939">
<style>
fieldset table td{ padding:4px 10px 4px 0px; line-height:18px; padding-right:0px;}
fieldset table th{ padding:4px 0px; line-height:18px;font-weight:normal; text-align:right; padding-left:5px }
</style>
</HEAD>
<body style="background:#DFE8F6;">
<p class="titletable">&nbsp;&nbsp;您所在的位置：业务管理 &gt; 会员公司管理</p>
<fieldset style="margin-top:20px;background-color:#FFF">
  <legend>查看会员详细资料</legend>
  
 <%
	Member checkMember=(Member)request.getAttribute("checkMember");
%>
  <table border="0" cellpadding="0" cellspacing="0">
    <tr>
      <th height="25">会员号：</th>
      <td><%=checkMember.getRoyId() %></td>
    </tr>
    <tr>
      <th height="25">会员名称：</th>
      <td><%=checkMember.getRoyName() %></td>
    </tr>
    <tr>
      <th height="25">余额：</th>
      <td><%=checkMember.getMoney() %></td>
    </tr>
    <tr>
      <th height="25">密码：</th>
      <td><%=checkMember.getPassword() %></td>
    </tr>
    <tr>
      <th height="25">会员等级：</th>
     <td><%=checkMember.getRoyType() %></td>
    </tr>
	
    <tr>
      <th height="25">&nbsp;</th>
      <td style="padding-left:100px"> 
      <a href="/Bysj/find?action=list"><input name="button3" type="submit"  id="button3" value="返回" style=" background-image: none;background-color: #036; color:#fff; width:80px; height:25px; line-height:25px; border:0px;"></a></td>
    </tr>
  </table>
</fieldset>

</body>
</html>
