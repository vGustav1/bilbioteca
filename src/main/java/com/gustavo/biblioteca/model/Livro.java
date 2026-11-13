package com.gustavo.biblioteca.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity 
public class Livro {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column 
    private String titulo;

    @Column
    private String autor;

    @Column
    private int ano;

    @Column
    private String ISBN;

    @Column
    private int exemplares;


    
}
