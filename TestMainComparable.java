package com.m2cafe.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMainComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList=new ArrayList<Integer>();
		intList.add(105);
		intList.add(104);
		intList.add(101);
		
		System.out.println(intList);
		Collections.sort(intList);
		System.out.println(intList);
		List<Student> stuList=new ArrayList<Student>();
		Student stu3=new Student(3,"selva","cse");
		Student stu1=new Student(1, "manoj", "cse");
		Student stu2=new Student(2,"mani","cse");
		stuList.add(stu3);
		stuList.add(stu1);
		stuList.add(stu2);
		System.out.println(stuList);
		StudentIdComparator st=new StudentIdComparator();
		
		Collections.sort(stuList);
		
		System.out.println(stuList);
		Collections.sort(stuList,new StuNameComparator());
		System.out.println(stuList);
//		
//		System.out.println(st.compare(stu1, stu2));
//		System.out.println(stu1.compareTo(stu2));
//		

	}

}
