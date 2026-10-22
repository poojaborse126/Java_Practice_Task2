package com.test;

public class Emp1SalaryDemo {
	public static void main(String[] args) {
		Emp1[] employees = { new PermanentEmp1(), new ContractEmp1() };

		for (Emp1 e : employees) {
			System.out.println(e.calculateSalary());
		}
	}
}
