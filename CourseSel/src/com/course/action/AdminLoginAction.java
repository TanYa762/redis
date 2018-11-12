package com.course.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.course.service.IAdminService;
import com.course.service.IStuService;
import com.opensymphony.xwork2.ActionSupport;
/**
 * Demo class
 * 
 * @author liutianyi
 * @date 2018/11/12
 */
public class AdminLoginAction extends ActionSupport {

    IAdminService adminService;
	
	private String name;
	private String pwd;
	
	public IAdminService getAdminService() {
		return adminService;
	}
	public void setAdminService(IAdminService adminService) {
		this.adminService = adminService;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Override
	public String execute() throws Exception {
		
		HttpServletRequest request=ServletActionContext.getRequest();
		if(adminService.checkAdmin(name, pwd)) 
		{
			request.getSession().setAttribute("admin", name);
        	return SUCCESS;
		}
        else {
        	request.setAttribute("error", "用户名或密码错误");
        	return INPUT;
	}
	}
}
