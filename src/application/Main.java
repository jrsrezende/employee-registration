package application;

import controllers.EmployeeController;

public class Main {
	public static void main(String[] args) {
		var employeeController = new EmployeeController();
		employeeController.registerEmployee();
	}
}
