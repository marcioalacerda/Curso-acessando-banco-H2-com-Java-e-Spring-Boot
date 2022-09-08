package com.devsuperior.aulaorm.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//mapeamento para tabela
@Entity
@Table(name = "tb_employee")
public class Employee {

	@Id//identificando que é a chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)// auto incrementavel
	private Long id;
	private String name;
	private Double salary;
	
	@ManyToOne// especificando o relacionamento (muito para um)
	@JoinColumn(name = "department_id")//especificando a chave extrangeira
	private Department department;

	public Employee() {
	}

	public Employee(Long id, String name, Double salary, Department department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Emproyee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	
	
}
