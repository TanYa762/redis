package com.course.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.course.pojo.Course;
import com.course.pojo.Stucourse;
import com.course.pojo.Student;
/**
 * Demo class
 * 
 * @author liutianyi
 * @date 2018/11/12
 */
public class AdminDaoImpl extends HibernateDaoSupport implements IAdminDao {

@Override
	public boolean checkAdmin(String name, String pwd) {
		
		 Query query=this.getSession().createQuery("from Manager where name=? and password=?");
		    query.setString(0, name).setString(1, pwd);
		    if(query.list().size()==0) {
		    	return false;
		    }
		    else {
		    	return true;
	}
}
@Override
	public List<Course> getAllCourse() {
		
		Query query=this.getSession().createQuery("from Course");
		return query.list();
	}
@Override
	public List<Student> getAllStudent() {
		
		Query query=this.getSession().createQuery("from Student");
		return query.list();
	}
@Override
	public void addCourse(Course course) {
		
		this.getHibernateTemplate().save(course);
	}
@Override
	public Course getCourseById(int id) {
		
		return (Course) this.getHibernateTemplate().load(Course.class, id);
	}
@Override
	public void updateCourse(Course course) {
		
		this.getHibernateTemplate().update(course);
	}
@Override
	public void delCourse(Course course) {
		
		this.getHibernateTemplate().delete(course);
	}
@Override
	public List<Course> getCourseByStuId(int id) {
		
		Query query=this.getSession().createQuery("from Stucourse where student.id=?");
		query.setInteger(0, id);
		List<Stucourse> sC=query.list();
		List<Course> courses=new ArrayList<Course>();
		for(Stucourse sc:sC) {
			 courses.add(sc.getCourse());
	
	}
		return courses;
}
@Override
	public List<Student> getStuByCourseId(int id) {
		
		Query query=this.getSession().createQuery("from Stucourse where course.id=?");
		query.setInteger(0, id);
		List<Stucourse> sC=query.list();
		List<Student> students=new ArrayList<Student>();
		for(Stucourse sc:sC) {
			 students.add(sc.getStudent());
		
	}
		return students;
		
}

}
