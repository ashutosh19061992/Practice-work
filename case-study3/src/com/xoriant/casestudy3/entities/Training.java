package com.xoriant.casestudy3.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Training {
	private String name;
	private Trainer trainer;
	private List<Trainee> traineeList = new ArrayList<Trainee>();
	private Course course;

	public Training() {

	}

	public Training(String name, Trainer trainer, Course course) {
		super();
		this.name = name;
		this.trainer = trainer;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTraineeList(List<Trainee> traineeList) {
		this.traineeList = traineeList;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public List<Trainee> getTraineeList() {
		return traineeList;
	}

	public boolean addTraines(Trainee trainee) {
		return this.traineeList.add(trainee);
	}

//	 get no of trainees for a particular training.
	public int getNoOfTrainees() {
		return this.getTraineeList().size();
	}

	// get training duration for a course unit wise.
	public double getTrainingDuration(Course course) {
		Double totalUnitDuration = 0.0;
		List<Module> moduleList = this.course.getModuleList();
		for (Module module : moduleList) {
			for (Unit unit : module.getUnitList()) {
				totalUnitDuration += unit.getHours();
			}
		}
		return totalUnitDuration;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Training [" + (name != null ? "name=" + name + ", " : "")
				+ (trainer != null ? "trainer=" + trainer + ", " : "")
				+ (traineeList != null ? "traineeList=" + traineeList + ", " : "")
				+ (course != null ? "course=" + course : "") + "]";
	}
}
