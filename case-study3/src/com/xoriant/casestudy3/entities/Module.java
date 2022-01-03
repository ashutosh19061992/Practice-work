package com.xoriant.casestudy3.entities;

import java.util.*;

public class Module {
	private List<Unit> unitList = new ArrayList<Unit>();

	public Module() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Unit> getUnitList() {
		return unitList;
	}

	public boolean addUnit(Unit unit) {
		return this.unitList.add(unit);
	}
}
