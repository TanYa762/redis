package com.course.action;

import com.course.pojo.Student;
import com.course.service.IStuService;
import com.opensymphony.xwork2.ActionSupport;
/**
 * Demo class
 * 
 * @author liutianyi
 * @date 2018/11/12
 */
public class SaveStuAction extends ActionSupport {

	private String name;
	private String pwd;
	private int age;
	
	IStuService stuService;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String execute() throws Exception {
		
		Student stu=new Student();
		stu.setName(name);
		stu.setPwd(pwd);
		stu.setAge(age);
		stuService.saveStu(stu);
		return SUCCESS;
	}
}
