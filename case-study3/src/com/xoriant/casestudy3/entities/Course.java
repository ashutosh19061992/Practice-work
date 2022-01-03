package com.xoriant.casestudy3.entities;

import java.util.ArrayList;
import java.util.List;

public class Course {

	private String name;
	private List<Module> moduleList = new ArrayList<Module>();

	public Course() {
		super();
	}

	public Course(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Module> getModuleList() {
		return moduleList;
	}

	public boolean addModule(Module module) {
		return this.moduleList.add(module);
	}

	@Override
	public String toString() {
		return "Course [" + (name != null ? "name=" + name + ", " : "")
				+ (moduleList != null ? "moduleList=" + moduleList : "") + "]";
	}
}
