package com.course.action;

import com.course.pojo.Course;
import com.course.service.IAdminService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Demo class
 * 
 * @author liutianyi
 * @date 2018/11/12
 */
public class AddCourseAction extends ActionSupport {

	IAdminService adminService;
	
	public IAdminService getAdminService() {
		return adminService;
	}
	public void setAdminService(IAdminService adminService) {
		this.adminService = adminService;
	}

	private String name;
	private String info;
	private int period;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	
	@Override
	public String execute() throws Exception {
		
		Course course=new Course();
		course.setName(name);
		course.setInfo(info);
		course.setPeriod(period);
		adminService.addCourse(course);
		return SUCCESS;
	}
}
