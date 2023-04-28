package com.douglas.lojalivros.service;

import com.douglas.lojalivros.dto.MessageResponseDTO;
import com.douglas.lojalivros.entity.Livros;
import com.douglas.lojalivros.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class LivroService {

    private LivroRepository livroRepository;

    @Autowired
    public LivroService(LivroRepository livroRepository){
        this.livroRepository = livroRepository;
    }

    public MessageResponseDTO create(Livros livro){
        Livros livroSalvo = livroRepository.save(livro);
        return MessageResponseDTO.builder()
                .message("Livro criado com ID: " + livroSalvo.getId()).build();
    }
}
