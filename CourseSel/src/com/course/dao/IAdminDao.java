package com.course.dao;

import java.util.List;

import com.course.pojo.Course;
import com.course.pojo.Student;
/**
 * Demo class
 * 
 * @author liutianyi
 * @date 2018/11/12
 */
public interface IAdminDao {

	public boolean checkAdmin(String name, String pwd);
	public List<Course> getAllCourse();
	public List<Student> getAllStudent();
	public Course getCourseById(int id);
	public void delCourse(Course course);
	public void updateCourse(Course course);
	public void addCourse(Course course);
	public List<Course> getCourseByStuId(int id);
	public List<Student> getStuByCourseId(int id);
}
