package com.xoriant.casestudy3.entities;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

	private String name;
	private Organization organization;
	private List<Training> trainingList = new ArrayList<Training>();

	public Trainer(String name, Organization organization) {
		super();
		this.name = name;
		this.organization = organization;
	}

	public Trainer() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public List<Training> getTrainingList() {
		return trainingList;
	}

	public boolean addTraining(Training training) {
		return this.trainingList.add(training);
	}

	public String getTraneeOrganizationName() {
		return this.name;
	}
}
