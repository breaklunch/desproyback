package com.descriptores.sistema.repositorios;


import com.descriptores.sistema.modelo.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {

}
