package controllers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.UUID;

import entities.Address;
import entities.Employee;
import repositories.EmployeeRepository;

public class EmployeeController {
	public void registerEmployee() {
		var sc = new Scanner(System.in);

		System.out.println("\nCADASTRO DE FUNCION�RIO:\n");

		var employee = new Employee();
		
		employee.setAddress(new Address());
	

		employee.setId(UUID.randomUUID());
		employee.getAddress().setId(UUID.randomUUID());
		
		System.out.print("INFORME O NOME................: ");
		employee.setName(sc.nextLine());
		
		System.out.print("INFORME O CPF.................: ");
		employee.setCpf(sc.nextLine());
		
		System.out.print("DATA DE ADMISSAO (dd/MM/yyyy).: ");
		employee.setAdmissionTime(LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		System.out.print("LOGRADOURO....................: ");
		employee.getAddress().setStreet(sc.nextLine());
		
		System.out.print("NUMERO........................: ");
		employee.getAddress().setNumber(sc.nextLine());
		
		System.out.print("COMPLEMENTO...................: ");
		employee.getAddress().setComplement(sc.nextLine());
		
		System.out.print("BAIRRO........................: ");
		employee.getAddress().setNeighborhood(sc.nextLine());
		
		System.out.print("CIDADE........................: ");
		employee.getAddress().setCity(sc.nextLine());
		
		System.out.print("ESTADO........................: ");
		employee.getAddress().setState(sc.nextLine());
		
		System.out.print("CEP...........................: ");
		employee.getAddress().setCep(sc.nextLine());
		sc.close();
		
		var employeeRepository = new EmployeeRepository();
		employeeRepository.insert(employee);
	}
}
