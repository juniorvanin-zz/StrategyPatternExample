package com.company;

import com.company.salary.SalaryStrategy;

public class Employee {

    protected final int id;
    protected final String firstName;
    protected final String lastName;
    protected final double baseSalary;

    private final SalaryStrategy salaryStrategy;

    private static String NEW_LINE = "\n";

    protected Employee(int id, String firstName, String lastName, double baseSalary, SalaryStrategy salaryStrategy){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
		this.baseSalary = baseSalary;
		this.salaryStrategy = salaryStrategy;
    }

    public String getInfo() {
        return  NEW_LINE + "Employee type: " + getClass().getSimpleName() +
                NEW_LINE + "Id:"+ id +
                NEW_LINE + "First Name:"+ firstName +
                NEW_LINE + "Last Name:" + lastName +
                NEW_LINE + "Gross salary:" + baseSalary +
                NEW_LINE + "Salary: " + salaryStrategy.calculateSalary();
    }}
