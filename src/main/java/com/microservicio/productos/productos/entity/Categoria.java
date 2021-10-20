package com.microservicio.productos.productos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tbl_categoria")
@Data
public class Categoria {

	@Id
	private Long id;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String name;
}
