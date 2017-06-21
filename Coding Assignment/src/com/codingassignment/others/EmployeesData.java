package com.codingassignment.others;

public class EmployeesData {
	
	private Employee[] Employees = new Employee[100]; //max for illustration
	
	private class Employee {
		Employee(int id, String name, String phone , String address) {
			this.id = id;
			this.name = name;
			this.address = address;
			this.phone = phone;
		}

		public String toString() {
			return "id:" + id 
			+ " name:" + name 
			+ "address:" + address
			+ "phone:" + phone;
		}
		
		private int id;
		private String name;
		private String address;
		private String phone;
	}
	public Employee getEmployees(int id) {
		return Employees[id];
	}
	public void addEmployees(Employee Employee) {
		this.Employees[Employee.id] = Employee;
	}
	
	public static void main(String[] args) {
		EmployeesData eData = new EmployeesData();
		
		EmployeesData.Employee e1 = eData. new Employee(1, "King", "King phone", "QueenAddress");
		eData.addEmployees(e1);
		
		EmployeesData.Employee e2 = eData. new Employee(2, "Queen", "Queen Phone", "King address");
		eData.addEmployees(e2);

		System.out.println(eData.getEmployees(1));
		System.out.println(eData.getEmployees(2));

	}
}
