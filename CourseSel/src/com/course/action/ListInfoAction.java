package com.course.action;

import java.util.Map;

import com.course.service.IAdminService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * Demo class
 * 
 * @author liutianyi
 * @date 2018/11/12
 */
public class ListInfoAction extends ActionSupport {

	IAdminService adminService;

	public IAdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(IAdminService adminService) {
		this.adminService = adminService;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
	   
		Map request = (Map) ActionContext.getContext().get("request");
	    request.put("allCourse", adminService.getAllCourse());
	    request.put("allStu", adminService.getAllStudent());
	    return SUCCESS;
	}
}
