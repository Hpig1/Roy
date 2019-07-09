<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
 <%@ page import="entity.Company" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<!-- saved from url=(0070)http://192.168.2.36:8011/cms/info/index.do -->
<HTML xmlns="http://www.w3.org/1999/xhtml">
<HEAD>
<TITLE>修改会员信息</TITLE>
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
<p class="titletable">&nbsp;&nbsp;您所在的位置：分公司详情 &gt; 修改店面信息</p>
 
<fieldset style="margin-top:20px;background-color:#FFF">
  
 
  <legend>修改店面信息（以下带<span class="txtred">*</span>为必填项）</legend>
<%
	Company updateCompany=(Company)request.getAttribute("updateCompany");
%>
 <form id="form" name="form" method="post" action="/Bysj/company?action=update">
  <table border="0" cellpadding="0" cellspacing="0">
    <tr>
      <th height="25">店铺名:</th>
      <td>
      <input type="text"   name="CompanyName" value="<%=updateCompany.getCompanyName()%>" disabled/>
      <input type="hidden" name="CompanyName" value="<%=updateCompany.getCompanyName()%>" />
      <span class="txtred">*</span>
      </td>
    </tr>
    <tr>
      <th height="25">店铺老板:</th>
      <td>
      <input type="text" name="CompanyKeeper" value="<%=updateCompany.getCompanyKeeper()%>" />
      <span class="txtred">*</span>
      </td>
    </tr>
    <tr>
      <th height="25">店铺地址:</th>
      <td> <input type="text" name="CompanyAddress" value="<%=updateCompany.getCompanyAddress()%>" />
      <span class="txtred">*</span>
      </td>
    </tr>
    <tr>
      <th height="25">店铺销售额:</th>
      <td> 
      <input type="text" name="Sales" value="<%=updateCompany.getSales()%>" />
      <span class="txtred">*</span>
      </td>
    </tr>
    <tr>
      <th height="25">会员总数:</th>
     <td> 
      <input type="text" name="MemberNumber" value="<%=updateCompany.getMemberNumber()%>" />
      <span class="txtred">*</span>
      </td>
    </tr>
	<tr>
				  	<td colspan="2"><div align="center">
				  	  <input type="submit" value="录入">				  	  
				  	  <input type="reset" value="重置">
			  	  </div>
				</td>
				  </tr>
  </table>
  </form>
</fieldset>

</body>
</html>
