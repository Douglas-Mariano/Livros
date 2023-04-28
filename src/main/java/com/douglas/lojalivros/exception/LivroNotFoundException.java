package com.douglas.lojalivros.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class LivroNotFoundException extends Exception {

    public LivroNotFoundException(Long id){
        super(String.format("Livro não existe", id));
    }
}
