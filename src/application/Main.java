package application;

import entities.Employee;
import repositories.EmployeeRepository;

import javax.swing.*;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao sistema de gerenciamento de funcionários!");

        String name = JOptionPane.showInputDialog("Digite o nome do funcionário.");
        String cpf = JOptionPane.showInputDialog("Digite o CPF do funcionário.");
        String registration = JOptionPane.showInputDialog("Digite a matrícula do funcionário.");
        String salary = JOptionPane.showInputDialog("Digite o salário do funcionário.");

        Employee employee = new Employee();
        employee.setId(UUID.randomUUID());
        employee.setName(name);
        employee.setCpf(cpf);
        employee.setRegistration(registration);
        employee.setSalary(Double.parseDouble(salary));

        System.out.println("Dados do Funcionário:");
        System.out.println("ID: " + employee.getId());
        System.out.println("Nome: " + employee.getName());
        System.out.println("CPF: " + employee.getCpf());
        System.out.println("Matrícula: " + employee.getRegistration());
        System.out.println("Salário: " + employee.getSalary());

        EmployeeRepository.exportToFile(employee);


    }
}
