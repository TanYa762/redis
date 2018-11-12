package com.course.dao;

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
public class StuDaoImpl extends HibernateDaoSupport implements IStuDao {

	@Override
	public void saveStu(Student stu) {
		
		this.getHibernateTemplate().save(stu);
	}
	@Override
	public Student checkStu(String name, String pwd) {
		
	    Query query=this.getSession().createQuery("from Student where name=? and pwd=?");
	    query.setString(0, name).setString(1, pwd);
	    if(query.list().size()==0) {
	    	return null;
	    }
	    else {
	    	return (Student) query.list().get(0);
	}
	}
	@Override
	public void saveStucourse(Stucourse sc) {
		
		this.getHibernateTemplate().save(sc);
	}
	@Override
	public void delStucourse(Student stu, Course course) {
		
		 Query query=this.getSession().createQuery("from Stucourse where student=? and course=?");
		 query.setEntity(0, stu).setEntity(1, course);
		 this.getHibernateTemplate().delete(query.list().get(0));
	}

}
