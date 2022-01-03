package com.xoriant.casestudy3.entities;

import java.util.ArrayList;
import java.util.List;

public class Unit {
	private String name;
	private double hours;
	private List<Topic> topicList = new ArrayList<Topic>();

	public Unit(double hours, String name) {
		super();
		this.setHours(hours);
		this.setName(name);
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public List<Topic> getTopicList() {
		return topicList;
	}

	public boolean addTopic(Topic topic) {
		return this.topicList.add(topic);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Unit [" + (name != null ? "name=" + name + ", " : "") + "hours=" + hours + ", "
				+ (topicList != null ? "topicList=" + topicList : "") + "]";
	}

}
