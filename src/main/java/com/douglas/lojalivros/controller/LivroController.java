package com.douglas.lojalivros.controller;

import com.douglas.lojalivros.dto.MessageResponseDTO;
import com.douglas.lojalivros.entity.Livros;
import com.douglas.lojalivros.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/livros")
public class LivroController {

    private LivroRepository livroRepository;

    @Autowired
    public LivroController(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody Livros livro){
        Livros livroSalvo = livroRepository.save(livro);
        return MessageResponseDTO.builder()
                .message("Livro criado com Id: " + livroSalvo.getId()).build();
    }
}
