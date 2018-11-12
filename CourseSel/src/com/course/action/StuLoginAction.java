package com.course.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.course.pojo.Student;
import com.course.service.IStuService;
import com.opensymphony.xwork2.ActionSupport;
/**
 * Demo class
 * 
 * @author liutianyi
 * @date 2018/11/12
 */
public class StuLoginAction extends ActionSupport {

	IStuService stuService;
	
	private String name;
	private String pwd;
	
	public IStuService getStuService() {
		return stuService;
	}
	public void setStuService(IStuService stuService) {
		this.stuService = stuService;
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
		Student stu=stuService.checkStu(name, pwd);
		if(stu!=null)
		{
			request.getSession().setAttribute("stu",stu);
        	return SUCCESS;
		}
        else {
        	request.setAttribute("error", "用户名或密码错误");
        	return INPUT;
	}
	}
}
