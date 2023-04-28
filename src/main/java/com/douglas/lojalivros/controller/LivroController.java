package com.douglas.lojalivros.controller;

import com.douglas.lojalivros.dto.LivrosDTO;
import com.douglas.lojalivros.dto.MessageResponseDTO;
import com.douglas.lojalivros.entity.Livros;
import com.douglas.lojalivros.repository.LivroRepository;
import com.douglas.lojalivros.service.LivroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/livros")
public class LivroController {

    private LivroService livroService;

    @Autowired
    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody @Valid LivrosDTO livrosDTO){

        return livroService.create(livrosDTO);
    }
    @GetMapping("/{id}")
    public LivrosDTO buscarPorId(@PathVariable Long id){
        return livroService.buscarPorId(id);
    }
}
