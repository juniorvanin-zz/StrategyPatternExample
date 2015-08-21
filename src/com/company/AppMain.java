package com.company;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
	 public static void main(String[] args) {
		 	Manager employeeManager = new Manager(1,"Ana","Alves",5000, 1000);

	        Salesman employeeSalesman1 = new Salesman(2, "Joao", "Carlos", 2000, 750);
	        Salesman employeeSalesman2 = new Salesman(3, "Maria", "Claudia", 2500, 10750);

	        List<Employee> employees = new ArrayList<Employee>();

	        employees.add(employeeManager);
	        employees.add(employeeSalesman1);
	        employees.add(employeeSalesman2);

	        for (Employee employee : employees){
	            System.out.println(employee.getInfo());
	        }
	 }
}
