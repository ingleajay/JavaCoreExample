package com.sorm.SpringOrm.annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity
@Table(name = "student_hibernate")
public class Student {
	
	@Id
	@Column(name="stud_id")
	private int sid;
	
	@Column(name="stud_name")
	private String sname;
	
	@Column(name="stud_branch")
	private String sbranch;
	
	public int getSid() {
		return sid;
	}
	
	public int setSid(int sid) {
		return this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSbranch() {
		return sbranch;
	}
	public void setSbranch(String sbranch) {
		this.sbranch = sbranch;
	}
	public Student(int sid, String sname, String sbranch) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sbranch = sbranch;
		
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sbranch=" + sbranch + " ]";
	}
	

	
}