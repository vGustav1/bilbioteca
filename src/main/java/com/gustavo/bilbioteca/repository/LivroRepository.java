package com.gustavo.bilbioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gustavo.bilbioteca.model.Livro;


@Repository 
public interface LivroRepository extends JpaRepository <Livro, Long>{


}