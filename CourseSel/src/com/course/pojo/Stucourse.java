package com.course.pojo;

/**
 * Stucourse entity. @author MyEclipse Persistence Tools
 */

public class Stucourse implements java.io.Serializable {

	// Fields

	private Integer id;
	private Student student;
	private Course course;

	// Constructors

	/** default constructor */
	public Stucourse() {
	}

	/** full constructor */
	public Stucourse(Student student, Course course) {
		this.student = student;
		this.course = course;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}