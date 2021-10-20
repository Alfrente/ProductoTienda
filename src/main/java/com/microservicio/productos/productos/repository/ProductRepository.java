package com.microservicio.productos.productos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicio.productos.productos.entity.Categoria;
import com.microservicio.productos.productos.entity.Produc;

public interface ProductRepository extends JpaRepository<Produc, Long> {
	
	public List<Produc> findByCategory(Categoria categoria); 
}
