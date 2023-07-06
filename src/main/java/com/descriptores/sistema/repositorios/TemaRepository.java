package com.descriptores.sistema.repositorios;


import com.descriptores.sistema.modelo.Curso;
import com.descriptores.sistema.modelo.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface TemaRepository extends JpaRepository<Tema,Long> {

    Set<Tema> findByCurso(Curso curso);
}
