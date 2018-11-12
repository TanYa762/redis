package com.course.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.course.pojo.Stucourse;
import com.course.pojo.Student;
import com.course.service.IAdminService;
import com.course.service.IStuService;
import com.opensymphony.xwork2.ActionSupport;
/**
 * Demo class
 * 
 * @author liutianyi
 * @date 2018/11/12
 */
public class SelCourseAction extends ActionSupport {

	IAdminService adminService;
	IStuService stuService;
	public IStuService getStuService() {
		return stuService;
	}
	public void setStuService(IStuService stuService) {
		this.stuService = stuService;
	}
	public IAdminService getAdminService() {
		return adminService;
	}
	public void setAdminService(IAdminService adminService) {
		this.adminService = adminService;
	}
	@Override
	public String execute() throws Exception {
		
		HttpServletRequest request=ServletActionContext.getRequest();
		Student stu=(Student) request.getSession().getAttribute("stu");
		int id=Integer.parseInt(request.getParameter("id"));
		Stucourse sc=new Stucourse();
		sc.setStudent(stu);
		sc.setCourse(adminService.getCourseById(id));
		stuService.saveStucourse(sc);
		return SUCCESS;
	}
}
