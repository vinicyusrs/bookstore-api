package com.vinicyus.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vinicyus.bookstore.domain.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

	

}
