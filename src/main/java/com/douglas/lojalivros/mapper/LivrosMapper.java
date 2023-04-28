package com.douglas.lojalivros.mapper;

import com.douglas.lojalivros.dto.LivrosDTO;
import com.douglas.lojalivros.entity.Livros;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LivrosMapper {

    LivrosMapper INSTANCE = Mappers.getMapper(LivrosMapper.class);

    Livros toModel(LivrosDTO livrosDTO);

    LivrosDTO toDTO(Livros livros);
}
