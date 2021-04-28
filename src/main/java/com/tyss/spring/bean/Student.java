package com.tyss.spring.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student implements Serializable {
	private int stid;
	private String stname;
	public Student(int stid, String stname) {
		super();
		this.stid = stid;
		this.stname = stname;
	}
	public Student() {
		
	}
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	


}
