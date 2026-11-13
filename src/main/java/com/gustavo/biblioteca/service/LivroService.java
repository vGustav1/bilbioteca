package com.gustavo.biblioteca.service;

import org.springframework.stereotype.Service;
import com.gustavo.biblioteca.model.Livro;
import com.gustavo.biblioteca.repository.LivroRepository;

@Service 

public class LivroService {

    private final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository){
        this.livroRepository = livroRepository;
    }


    public Livro buscar(Long id){
        return livroRepository.findById(id).orElse(null);
    }


    public Livro criar(Livro livro){
        return livroRepository.save(livro);
    }

    public Livro atualizar(Livro livro, Long id ){
        if(!livroRepository.existsById(id)){
            throw new IllegalArgumentException("O livro não existe");
        }

        livro.setId(id);
        return livroRepository.save(livro);
    }

    public void deletar(Long id){
        if(!livroRepository.existsById(id)){
            throw new IllegalArgumentException("O livro não existe");
        }
        livroRepository.deleteById(id);
    }
}
