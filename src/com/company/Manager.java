package com.company;

import com.company.salary.BonusStrategy;

public class Manager extends Employee {

	protected Manager(int id, String firstName, String lastName,
			double baseSalary, double bonus) {
		super(id, firstName, lastName, baseSalary, new BonusStrategy(baseSalary, bonus));
	}


}
