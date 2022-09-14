package com.thinkquestioent.collection;

import java.util.Comparator;

public class DepartmentSorting implements Comparator<Department>{

	@Override
	public int compare(Department o1, Department o2) {
		// TODO Auto-generated method stub
		
		return o1.getName().compareTo(o2.getName());
	}

	

}
