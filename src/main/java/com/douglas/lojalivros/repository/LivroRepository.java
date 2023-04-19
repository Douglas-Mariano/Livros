package com.douglas.lojalivros.repository;

import com.douglas.lojalivros.entity.Livros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livros, Long> {
}
