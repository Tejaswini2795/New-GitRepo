package com.thinkquestioent.collection;

public class Student implements Comparable<Student> {
	int rollNo;
	String Name;

	public Student() {
		super();
	}

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		Name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Name=" + Name + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (o.rollNo < rollNo)
			return 1;
		if (o.rollNo > rollNo)
			return -1;
		else
			return 0;
	}

}
