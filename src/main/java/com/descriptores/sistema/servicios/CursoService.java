package com.descriptores.sistema.servicios;

import com.descriptores.sistema.modelo.Categoria;
import com.descriptores.sistema.modelo.Curso;


import java.util.List;
import java.util.Set;

public interface CursoService {
    Curso agregarCurso(Curso curso);

    Curso actualizarCurso(Curso curso);

    Set<Curso> obtenerCursos();

    Curso obtenerCurso(Long cursoId);

    void eliminarCurso(Long cursoId);

    List<Curso> listarCursosDeUnaCategoria(Categoria categoria);

    List<Curso> obtenerCursosActivos();

    List<Curso> obtenerCursosActivosDeUnaCategoria(Categoria categoria);
}
