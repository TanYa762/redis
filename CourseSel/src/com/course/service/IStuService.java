package com.course.service;

import com.course.pojo.Course;
import com.course.pojo.Stucourse;
import com.course.pojo.Student;
/**
 * Demo class
 * 
 * @author liutianyi
 * @date 2018/11/12
 */
public interface IStuService {

	public void saveStu(Student stu);
	public Student checkStu(String name, String pwd);
	public void saveStucourse(Stucourse sc);
	public void delStucourse(Student stu, Course course);
}
