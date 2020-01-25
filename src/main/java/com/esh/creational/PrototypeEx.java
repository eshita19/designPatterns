package com.esh.creational;

import java.util.ArrayList;
import java.util.List;

class Employee {
	public Employee(String name) {
		this.name = name;
	}

	String name;
}

class Manager implements Cloneable {
	String name;
	List<Employee> employees = new ArrayList<>();

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Manager manager = new Manager();
		manager.name = name;
		for (Employee employee : employees) {
			manager.employees.add(new Employee(employee.name));
		}
		return manager;
	}
}

public class PrototypeEx {
	public static void main(String[] args) throws CloneNotSupportedException {
		Manager manager = new Manager();
		manager.name = "eshita";
		manager.employees.add(new Employee("e1"));

		Manager managerClone = (Manager) manager.clone();
		managerClone.name = "Etisha";
		System.out.println(managerClone.employees.get(0).name);

	}
}
