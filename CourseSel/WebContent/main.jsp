<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'main.jsp' starting page</title>
    
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
    <script type="text/javascript">
	function del()
	{
		if(confirm("你真的想删除该记录么？"))
		{
			return true;
		}
		return false;
	}
	</script>
  </head>
  
  <body bgcolor="E6EAE9">
            管理员：${admin} <s:a href="course_add.jsp">添加课程</s:a>
          <hr>
         <center>
                                             信息列表
            <table width="70%" border="1" cellpadding="0" cellspacing="0">
               <tr bgcolor="CAE8EA"><td colspan="5">课程信息</td></tr>
                <tr bgcolor="CAE8EA"><td>课程编号</td><td>课程名称</td><td>课程信息</td><td>课程课时</td><td>操作</td></tr>
                <s:iterator value="#request.allCourse" id="course">
                 <tr><td><s:property value="#course.id"/></td>
	                 <td><s:property value="#course.name"/></td>
	                 <td><s:property value="#course.info"/></td>
	                 <td><s:property value="#course.period"/></td>
	                 <td><s:a href="delCourse.action?id=%{#course.id}" onclick="return del();">删除</s:a>
	                     <s:a href="showCourse.action?id=%{#course.id}">修改</s:a>
	                     <s:a href="showCourseStu.action?id=%{#course.id}">查看选课学生</s:a></td></tr>
                </s:iterator>
            </table>  
            <table width="70%" border="1" cellpadding="0" cellspacing="0">
              <tr bgcolor="CAE8EA"><td colspan="4">学生信息</td></tr>
               <tr bgcolor="CAE8EA"><td>学生编号</td><td>学生姓名</td><td>学生年龄</td><td>操作</td></tr>
                <s:iterator value="#request.allStu" id="student">
                 <tr><td><s:property value="#student.id"/></td>
	                 <td><s:property value="#student.name"/></td>
	                 <td><s:property value="#student.age"/></td>
	                 <td><s:a href="showStuCourse.action?id=%{#student.id}">查看</s:a></td></tr>
                </s:iterator>
            </table>                                   
         </center>
  </body>
</html>
