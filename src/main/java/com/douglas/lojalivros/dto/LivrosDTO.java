package com.douglas.lojalivros.dto;


import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LivrosDTO {

    private Long id;

    @NotBlank
    @Size(max = 200)
    private String nome;

    @NotNull
    private Integer paginas;

    @NotNull
    private Integer capitulos;

    @NotBlank
    @Size(max = 200)
    private String editora;

    @Valid
    @NotNull
    private AutorDTO autor;
}
