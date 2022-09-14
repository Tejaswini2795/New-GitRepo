package com.thinkquestioent.collection;

import java.util.List;

public class Department {
	int id;
	String name;
	List<Student> listOfStudents;
	
	public Department() {
		super();
	}
	public Department(int id, String name, List<Student> listOfStudents) {
		super();
		this.id = id;
		this.name = name;
		this.listOfStudents = listOfStudents;
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
	public List<Student> getListOfStudents() {
		return listOfStudents;
	}
	public void setListOfStudents(List<Student> listOfStudents) {
		this.listOfStudents = listOfStudents;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", listOfStudents=" + listOfStudents + "]";
	}
	

}
