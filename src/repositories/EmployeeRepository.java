package repositories;

import entities.Employee;

import java.io.PrintWriter;

public class EmployeeRepository {
    public static void exportToFile(Employee employee) {
        try {
            PrintWriter writer = new PrintWriter("Funcionário-" + employee.getId() + ".txt");
            writer.write(employee.getId() + "\n");
            writer.write(employee.getName() + "\n");
            writer.write(employee.getCpf() + "\n");
            writer.write(employee.getRegistration() + "\n");
            writer.write(employee.getSalary() + "\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
