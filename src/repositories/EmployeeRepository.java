package repositories;

import java.sql.Date;
import java.sql.DriverManager;

import entities.Employee;

public class EmployeeRepository {
	public void insert(Employee employee) {
		try {
			var host = "jdbc:mysql://localhost:3306/bd_aula03?useSSL=false&serverTimezone=UTC";
			var user = "root";
			var pass = "12345";

			var connection = DriverManager.getConnection(host, user, pass);

			var statementAdr = connection.prepareStatement(
					"insert into endereco(id, logradouro, numero, complemento, bairro, cidade, estado, cep) values(?, ?, ?, ?, ?, ?, ?, ?)");

			statementAdr.setString(1, employee.getAddress().getId().toString());
			statementAdr.setString(2, employee.getAddress().getStreet());
			statementAdr.setString(3, employee.getAddress().getNumber());
			statementAdr.setString(4, employee.getAddress().getComplement());
			statementAdr.setString(5, employee.getAddress().getNeighborhood());
			statementAdr.setString(6, employee.getAddress().getCity());
			statementAdr.setString(7, employee.getAddress().getState());
			statementAdr.setString(8, employee.getAddress().getCep());
			statementAdr.execute();

			var statementEmp = connection.prepareStatement(
					"insert into funcionario(id, nome, cpf, dataadmissao, endereco_id) values(?, ?, ?, ?, ?)");
			statementEmp.setString(1, employee.getId().toString());
			statementEmp.setString(2, employee.getName());
			statementEmp.setString(3, employee.getCpf());
			statementEmp.setString(3, employee.getCpf());
			statementEmp.setDate(4, Date.valueOf(employee.getAdmissionTime()));
			statementEmp.setString(5, employee.getAddress().getId().toString());
			statementEmp.execute();

			connection.close();
			
			System.out.println("Dados gravados com sucesso!");
		} catch (Exception e) {
			System.out.println("\nFalha ao gravar funcion�rio: " + e.getMessage());
		}
	}
}
