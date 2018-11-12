package com.course.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.course.service.IAdminService;
import com.opensymphony.xwork2.ActionSupport;
/**
 * Demo class
 * 
 * @author liutianyi
 * @date 2018/11/12
 */
public class ShowCourseStu extends ActionSupport {

	IAdminService adminService;

	public IAdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(IAdminService adminService) {
		this.adminService = adminService;
	}
	
	@Override
	public String execute() throws Exception {
		
		HttpServletRequest request=ServletActionContext.getRequest();
		int id=Integer.parseInt(request.getParameter("id"));
		request.setAttribute("allStu", adminService.getStuByCourseId(id));
		return SUCCESS;
	}
}
