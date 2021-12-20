package com.m2cafe.test;

public class Student implements Comparable<Student>
{
	
	private int id;
	
	private String name;
	
	private String dept;

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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	
	@Override
	public String toString() {
		return "\nid=" + id + "\nname=" + name + "\ndept=" + dept ;
	}

	@Override
	public int compareTo(Student s2) {
		// TODO Auto-generated method stub
		
		if(this.id==s2.id)
		{
			return 0;
		}
		else if(this.id>s2.id)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}

	
	
	

}
