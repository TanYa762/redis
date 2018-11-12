<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>学生选课信息</title>
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
              <tr bgcolor="CAE8EA"><td colspan="5">学生选课信息</td></tr>
              <tr bgcolor="CAE8EA"><td>序号</td><td>课程编号</td><td>课程名称</td><td>课程信息</td><td>课程课时</td></tr>
                <s:iterator id="course" value="#request.stuCourse" status="st">
                 <tr><td><s:property value="#st.count"/></td>
                     <td><s:property value="#course.id"/></td>
	                 <td><s:property value="#course.name"/></td>
	                 <td><s:property value="#course.info"/></td>
	                 <td><s:property value="#course.period"/></td></tr>
                </s:iterator>
       </table> 
     </center> 
  </body>
</html>
