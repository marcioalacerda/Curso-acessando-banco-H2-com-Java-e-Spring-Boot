package com.devsuperior.aulaorm.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//mapeamento para tabela
@Entity
@Table(name = "tb_department")
public class Department {

	@Id//identificando que é a chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)// auto incrementavel
	private Long id;
	private String name;
	
	public Department() {
	}

	public Department(Long id, String name) {
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
	
}
