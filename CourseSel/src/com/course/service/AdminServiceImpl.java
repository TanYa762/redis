package com.course.service;

import java.util.List;

import com.course.dao.IAdminDao;
import com.course.pojo.Course;
import com.course.pojo.Student;
/**
 * Demo class
 * 
 * @author liutianyi
 * @date 2018/11/12
 */
public class AdminServiceImpl implements IAdminService {

	IAdminDao adminDao;
	
	public IAdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(IAdminDao adminDao) {
		this.adminDao = adminDao;
	}
	@Override
	public boolean checkAdmin(String name, String pwd) {
		
		return adminDao.checkAdmin(name, pwd);
	}
	@Override
	public List<Course> getAllCourse() {
		return adminDao.getAllCourse();
	}
	@Override
	public List<Student> getAllStudent() {
		return adminDao.getAllStudent();
	}
	@Override
	public void addCourse(Course course) {
		
		adminDao.addCourse(course);
	}
	@Override
	public void delCourse(Course course) {
		
		adminDao.delCourse(course);
	}
	@Override
	public Course getCourseById(int id) {
		
		return adminDao.getCourseById(id);
	}
	@Override
	public void updateCourse(Course course) {
		
		adminDao.updateCourse(course);
	}
	@Override
	public List<Course> getCourseByStuId(int id) {
		
		return adminDao.getCourseByStuId(id);
	}
	@Override
	public List<Student> getStuByCourseId(int id) {
		
		return adminDao.getStuByCourseId(id);
	}

}
