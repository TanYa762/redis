package com.course.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Course entity. @author MyEclipse Persistence Tools
 */

public class Course implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String info;
	private Integer period;
	private Set stucourses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Course() {
	}

	/** minimal constructor */
	public Course(String name, String info, Integer period) {
		this.name = name;
		this.info = info;
		this.period = period;
	}

	/** full constructor */
	public Course(String name, String info, Integer period, Set stucourses) {
		this.name = name;
		this.info = info;
		this.period = period;
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

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	public Set getStucourses() {
		return this.stucourses;
	}

	public void setStucourses(Set stucourses) {
		this.stucourses = stucourses;
	}

}