package com.descriptores.sistema.repositorios;

import com.descriptores.sistema.modelo.Categoria;
import com.descriptores.sistema.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CursoRepository extends JpaRepository<Curso,Long> {

    List<Curso> findByCategoria(Categoria categoria);

    List<Curso> findByActivo(Boolean estado);

    List<Curso> findByCategoriaAndActivo(Categoria categoria,Boolean estado);
}
