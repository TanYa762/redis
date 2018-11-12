<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'stu_info.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
      <style type="text/css">
        td{text-align:center;
           padding: 0;
        }
       </style>
       <script type="text/javascript">
	function del()
	{
		if(confirm("确实要删除此门课程吗?"))
		{
			return true;
		}
		return false;
	}
	</script>
  </head>
  
  <body bgcolor="E6EAE9">
          学生：${stu.name}
    <hr/>
         <center>
                                             信息列表
            <table width="70%" border="1" cellpadding="0" cellspacing="0">
               <tr><td colspan="5">供选择的课程信息</td></tr>
                <tr><td>课程编号</td><td>课程名称</td><td>课程信息</td><td>课程课时</td><td>操作</td></tr>
                <s:iterator value="#request.allCourse" id="course">
                 <tr><td><s:property value="#course.id"/></td>
	                 <td><s:property value="#course.name"/></td>
	                 <td><s:property value="#course.info"/></td>
	                 <td><s:property value="#course.period"/></td>
	                 <td><s:a href="selCourse.action?id=%{#course.id}">选课</s:a></td>
	             </tr>
                </s:iterator>
            </table>  
            <table width="70%" border="1" cellpadding="0" cellspacing="0">
              <tr><td colspan="6">学生选课信息</td></tr>
              <tr><td>序号</td><td>课程编号</td><td>课程名称</td><td>课程信息</td><td>课程课时</td><td>操作</td></tr>
                <s:iterator id="course" value="#request.stuCourse" status="st">
                 <tr><td><s:property value="#st.count"/></td>
                     <td><s:property value="#course.id"/></td>
	                 <td><s:property value="#course.name"/></td>
	                 <td><s:property value="#course.info"/></td>
	                 <td><s:property value="#course.period"/></td>
	                 <td><s:a href="delSelCourse.action?id=%{#course.id}" onclick="return del();">删除</s:a></td>
	              </tr>
                </s:iterator>
           </table>                    
         </center>
  </body>
</html>
