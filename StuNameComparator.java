package com.m2cafe.test;

import java.util.Comparator;

public class StuNameComparator implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		
		if(s1.getName().equals(s2.getName()))
		{
			return 0;
		}
		else
		{
		return s1.getName().compareTo(s2.getName());
	}
	}

}
