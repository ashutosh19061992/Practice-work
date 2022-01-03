package com.xoriant.casestudy3;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String name;
	private List<Assesment>  assesments=new ArrayList<>();
	
	public Course(String name) {
		super();
		this.name = name;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Assesment> getAssesments() {
		return assesments;
	}

	public boolean addAssesment( Assesment assesment) {
		return this.assesments.add(assesment);
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", assesments=" + assesments + "]";
	}
}
