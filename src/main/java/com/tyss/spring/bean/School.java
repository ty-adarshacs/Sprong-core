package com.tyss.spring.bean;

import java.io.Serializable;

public class School implements Serializable {
	private int id;
	private String sname;
	private Student student;
	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}

   
	public School(int id, String sname,Student student) {
		
		this.id = id;
		this.sname = sname;
		this.student=student;
	}
	
	
	public School() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
}
