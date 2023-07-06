package com.descriptores.sistema.repositorios;

import com.descriptores.sistema.modelo.Curso;
import com.descriptores.sistema.modelo.Material;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface MaterialRepository extends JpaRepository<Material,Long> {

    Set<Material> findByCurso(Curso curso);
}
