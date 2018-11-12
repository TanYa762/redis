package com.course.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String pwd;
	private Integer age;
	private Set stucourses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(String name, String pwd, Integer age) {
		this.name = name;
		this.pwd = pwd;
		this.age = age;
	}

	/** full constructor */
	public Student(String name, String pwd, Integer age, Set stucourses) {
		this.name = name;
		this.pwd = pwd;
		this.age = age;
		this.stucourses = stucourses;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Set getStucourses() {
		return this.stucourses;
	}

	public void setStucourses(Set stucourses) {
		this.stucourses = stucourses;
	}

}