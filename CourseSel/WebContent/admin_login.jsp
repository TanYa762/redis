<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>管理员登录</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body bgcolor="E6EAE9">
  <center>
    <h1>管理员登陆</h1>
    <s:form action="admin_login">
    	<s:textfield name="name" label="姓名"></s:textfield><font color="red">${error}</font>
    	<s:password name="pwd" label="密码"></s:password>
    	<s:submit value="登录"></s:submit>
    </s:form>
   </center>
  </body>
</html>
