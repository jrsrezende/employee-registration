package entities;

import java.time.LocalDate;
import java.util.UUID;

public class Employee {
	private UUID id;
	private String name;
	private String cpf;
	private LocalDate admissionTime;
	private Address address;

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getAdmissionTime() {
		return admissionTime;
	}

	public void setAdmissionTime(LocalDate admissionTime) {
		this.admissionTime = admissionTime;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
