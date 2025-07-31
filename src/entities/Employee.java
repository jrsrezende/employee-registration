package entities;

import java.util.UUID;

public class Employee {
    private UUID id;
    private String name;
    private String cpf;
    private String registration;
    private Double salary;

    public Employee(UUID id, String name, String cpf, String registration, Double salary) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.registration = registration;
        this.salary = salary;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
