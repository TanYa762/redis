<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>  
    <title>My JSP 'courseStu.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
     <style type="text/css">
        td{text-align:center;}
     </style>
  </head>
  
  <body bgcolor="E6EAE9">
    <center>
       <table width="70%" border="1" cellpadding="0" cellspacing="0">
              <tr bgcolor="CAE8EA"><td colspan="4">课程被选信息</td></tr>
               <tr bgcolor="CAE8EA"><td>序号</td><td>学生编号</td><td>学生姓名</td><td>学生年龄</td></tr>
                <s:iterator value="#request.allStu" id="student" status="st">
                 <tr><td><s:property value="#st.count"/></td>
                     <td><s:property value="#student.id"/></td>
	                 <td><s:property value="#student.name"/></td>
	                 <td><s:property value="#student.age"/></td>
	             </tr>
                </s:iterator>
       </table>  
    </center>        
  </body>
</html>
