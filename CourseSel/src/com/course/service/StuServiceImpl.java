package com.course.service;

import com.course.dao.IStuDao;
import com.course.pojo.Course;
import com.course.pojo.Stucourse;
import com.course.pojo.Student;
/**
 * Demo class
 * 
 * @author liutianyi
 * @date 2018/11/12
 */
public class StuServiceImpl implements IStuService {

	IStuDao stuDao;
	
	public IStuDao getStuDao() {
		return stuDao;
	}

	public void setStuDao(IStuDao stuDao) {
		this.stuDao = stuDao;
	}
	@Override
	public void saveStu(Student stu) {
		
        stuDao.saveStu(stu);
	}
	@Override
	public Student checkStu(String name, String pwd) {
		
		return stuDao.checkStu(name, pwd);
	}
	@Override
	public void saveStucourse(Stucourse sc) {
		
		stuDao.saveStucourse(sc);
	}
	@Override
	public void delStucourse(Student stu, Course course) {
		
		stuDao.delStucourse(stu, course);
	}

}
