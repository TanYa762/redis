package com.course.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.course.pojo.Student;
import com.course.service.IAdminService;
import com.course.service.IStuService;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * 
 * @author liutianyi
 * @date 2018/11/12
 */
public class DelSelCourse extends ActionSupport {

	IAdminService adminService;
	IStuService stuService;
	
	public IAdminService getAdminService() {
		return adminService;
	}
	public void setAdminService(IAdminService adminService) {
		this.adminService = adminService;
	}
	public IStuService getStuService() {
		return stuService;
	}
	public void setStuService(IStuService stuService) {
		this.stuService = stuService;
	}
	
	@Override
	public String execute() throws Exception {
		
		HttpServletRequest request=ServletActionContext.getRequest();
		Student stu=(Student) request.getSession().getAttribute("stu");
		int id=Integer.parseInt(request.getParameter("id"));
		stuService.delStucourse(stu, adminService.getCourseById(id));
		return SUCCESS;
	}
}
