package com.douglas.lojalivros.service;

import com.douglas.lojalivros.dto.LivrosDTO;
import com.douglas.lojalivros.dto.MessageResponseDTO;
import com.douglas.lojalivros.entity.Livros;
import com.douglas.lojalivros.exception.LivroNotFoundException;
import com.douglas.lojalivros.mapper.LivrosMapper;
import com.douglas.lojalivros.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class LivroService {

    private LivroRepository livroRepository;

    private final LivrosMapper livrosMapper = LivrosMapper.INSTANCE;

    @Autowired
    public LivroService(LivroRepository livroRepository){
        this.livroRepository = livroRepository;
    }

    public MessageResponseDTO create(LivrosDTO livrosDTO){
        Livros livroParaSalvar = livrosMapper.toModel(livrosDTO);

        Livros livroSalvo = livroRepository.save(livroParaSalvar);
        return MessageResponseDTO.builder()
                .message("Livro criado com ID: " + livroSalvo.getId()).build();
    }

    public LivrosDTO buscarPorId(Long id) throws LivroNotFoundException {
        Livros livro = livroRepository.findById(id)
                .orElseThrow(()-> new LivroNotFoundException(id));

        return livrosMapper.toDTO(livro);
    }
}
