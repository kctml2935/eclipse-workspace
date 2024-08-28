package com.itwill05.service.collection.student;

import java.util.Comparator;

public class StudentNameAscendingComparator implements Comparator<Student> {

	@Override
	public int compare(Student a1, Student a2) {
		if (a1.getName().compareTo(a2.getName()) > 0) {
			return 1;
		}
		return -1;
	}
	

	

}