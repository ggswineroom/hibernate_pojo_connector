package com.demo.model;
// Generated Mar 3, 2021, 12:02:21 PM by Hibernate Tools 5.4.27.Final

/**
 * Laptop generated by hbm2java
 */
public class Laptop implements java.io.Serializable {

	private int id;
	private Student student;
	private String lname;

	public Laptop() {
	}

	public Laptop(int id) {
		this.id = id;
	}

	public Laptop(int id, Student student, String lname) {
		this.id = id;
		this.student = student;
		this.lname = lname;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

}
