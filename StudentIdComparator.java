package com.m2cafe.test;

import java.util.Comparator;

public class StudentIdComparator implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if(s1.getId()==s2.getId())
		{
			return 0;
		}
		else if(s1.getId()>s2.getId())
		{
		return 1;	
		}
		else
		{
			return -1;
		}
		
	}
	

}
