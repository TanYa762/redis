<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

  </head>
  
  <body bgcolor="E6EAE9"> 
   <center>
     <s:form action="addCourse">
    	<s:textfield name="name" label="课程名称"></s:textfield>
    	<s:textfield name="info" label="课程信息"></s:textfield>
    	<s:textfield name="period" label="课程课时"></s:textfield>
		<s:submit value="添加"></s:submit>	    
    </s:form>
    </center>
  </body>
</html>
