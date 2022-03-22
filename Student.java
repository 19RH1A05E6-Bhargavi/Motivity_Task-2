package com.spring;

public class Student {
	private int id;
	private String name;
	private String branch;
	private String section;
	public Student() {

	}
	public Student(int id, String name, String branch, String section) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.section = section;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", section=" + section + "]";
	}
	
	
}
