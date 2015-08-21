package com.company;

import com.company.salary.ComissionStrategy;

public class Salesman extends Employee {

	protected Salesman(int id, String firstName, String lastName,
			double baseSalary, int amountSold) {
		super(id, firstName, lastName, baseSalary, new ComissionStrategy(baseSalary, amountSold));
	}
}
