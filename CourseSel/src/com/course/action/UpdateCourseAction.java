package com.course.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.course.pojo.Course;
import com.course.service.IAdminService;
import com.opensymphony.xwork2.ActionSupport;
/**
 * Demo class
 * 
 * @author liutianyi
 * @date 2018/11/12
 */
public class UpdateCourseAction extends ActionSupport {

	IAdminService adminService;
	private int id;
	private String name;
	private String info;
	private int period;
	
	public IAdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(IAdminService adminService) {
		this.adminService = adminService;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
		Course course=adminService.getCourseById(id);
		course.setName(name);
		course.setInfo(info);
		course.setPeriod(period);
		adminService.updateCourse(course);
		return SUCCESS;
	}
}
