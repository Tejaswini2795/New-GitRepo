package com.thinkquestioent.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TestClass {
	Scanner sc = new Scanner(System.in);
	Map<Integer, Department> departmentMap = new HashMap<>();
	List<Student> studentList1 = new ArrayList<>();
	List<Student> studentList2 = new ArrayList<Student>();
	List<Student> studentList3 = new ArrayList<Student>();
	List<Student> studentList4 = new ArrayList<Student>();

	public void setDepartmentData() {

		studentList1.add(new Student(101, "Akshay"));
		studentList1.add(new Student(110, "Niha"));
		studentList1.add(new Student(111, "Asha"));
		studentList1.add(new Student(116, "Soha"));
		Department department1 = new Department(1, "Computer", studentList1);
		departmentMap.put(department1.getId(), department1);

		studentList2.add(new Student(105, "Aahan"));
		studentList2.add(new Student(112, "Bhushan"));
		studentList2.add(new Student(114, "Mahesh"));
		studentList2.add(new Student(108, "Revati"));
		Department department2 = new Department(2, "Mech", studentList2);
		departmentMap.put(department2.getId(), department2);

		studentList3.add(new Student(106, "Vishal"));
		studentList3.add(new Student(113, "Dhami"));
		studentList3.add(new Student(118, "Kartiki"));
		studentList3.add(new Student(102, "Aryan"));
		Department department3 = new Department(3, "Civil", studentList3);
		departmentMap.put(department3.getId(), department3);

		studentList4.add(new Student(107, "Sia"));
		studentList4.add(new Student(115, "Deepika"));
		studentList4.add(new Student(117, "Ayushi"));
		studentList4.add(new Student(119, "Shruti"));
		Department department4 = new Department(4, "ENTC", studentList4);
		departmentMap.put(department4.getId(), department4);

		// Lambada Function

		
		List<Student> studentList = new ArrayList<Student>();
		studentList.addAll(studentList1);
		studentList.addAll(studentList2);
		studentList.addAll(studentList3);
		studentList.addAll(studentList4);

		Collections.sort(studentList);
		System.out.println("sorted student List");
		studentList.forEach(stdList ->System.out.println(stdList));
		//Comparator<Department> byName = (Department d1, Department d2) -> 
				//						d1.getName().compareTo(d2.getName());
		//departmentMap.forEach((k, v) -> System.out.println("keys: " + k + " Values:" + v));


		
		ArrayList<Department> al = new ArrayList<>();
		
		departmentMap.forEach((k, v) -> al.add(v));
		Collections.sort(al, new DepartmentSorting());
		System.out.println("Sorting by department name");
		al.forEach(l -> System.out.println(l));
		 
		/*
		 * Set<Integer> s = departmentMap.keySet();
		 * 
		 * for (Integer integer : s) { System.out.println(departmentMap.get(integer)); }
		 */

	}

	public void sortDataByName(Map<Integer, Department> depMap) {

	}

	/*
	 * public void setStudentData(){ Student s = new Student(); List <Student>
	 * studentList = new ArrayList<Student>(); studentList.addAll(studentList1);
	 * 
	 * studentList.addAll(studentList2); studentList.addAll(studentList3);
	 * studentList.addAll(studentList4);
	 * 
	 * 
	 * for (Student student : studentList) { System.out.println(student); }
	 * 
	 * System.out.println("====================");
	 * 
	 * 
	 * 
	 * 
	 * //return studentList; }
	 */

	/*
	 * public void getStudentData() {
	 * 
	 * }
	 * 
	 * public void getDepartmentData() {
	 * 
	 * }
	 */
	public static void main(String[] args) {
		TestClass tc = new TestClass();
		tc.setDepartmentData();
	}
}
