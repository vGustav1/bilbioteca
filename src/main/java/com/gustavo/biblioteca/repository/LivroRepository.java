package com.gustavo.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavo.biblioteca.model.Livro;


@Repository 
public interface LivroRepository extends JpaRepository <Livro, Long>{


}