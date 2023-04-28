package com.douglas.lojalivros.controller;

import com.douglas.lojalivros.dto.MessageResponseDTO;
import com.douglas.lojalivros.entity.Livros;
import com.douglas.lojalivros.repository.LivroRepository;
import com.douglas.lojalivros.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/livros")
public class LivroController {

    private LivroService livroService;

    @Autowired
    public LivroController(LivroService livroService) {

        this.livroService = livroService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody Livros livro){
        return livroService.create(livro);
    }
}
