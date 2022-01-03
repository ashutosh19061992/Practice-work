package com.xoriant.casestudy3;

import java.util.ArrayList;
import java.util.List;

public class Iteration {
	private Course course;
	private List<Assesment> assesments = new ArrayList<>();

	public Iteration(Course course) {
		super();
		this.course = course;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public List<Assesment> getAssesments() {
		return assesments;
	}

	public boolean addAssesment(Assesment assesment) {
		return this.assesments.add(assesment);
	}

	@Override
	public String toString() {
		return "Iteration [course=" + course + ", assesments=" + assesments + "]";
	}

}
