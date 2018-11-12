<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  
  <body bgcolor="E6EAE9">
   <center>
    <form action="updateCourse.action" method="post">
                     课程编号:<input type="text" name="id" readonly="readonly" value="${course.id}"/><br/>
                     课程名称:<input type="text" name="name" value="${course.name}"/><br/>
                     课程信息:<input type="text" name="info" value="${course.info}"/><br/>
                     课程课时:<input type="text" name="period" value="${course.period}"/> <br/>
            <input type="submit" value="更新"/>       
    </form>
    </center>
  </body>
</html>
