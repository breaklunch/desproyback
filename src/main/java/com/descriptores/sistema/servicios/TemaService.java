package com.descriptores.sistema.servicios;


import com.descriptores.sistema.modelo.Curso;

import com.descriptores.sistema.modelo.Tema;

import java.util.Set;

public interface TemaService {

    Tema agregarTema(Tema tema);

    Tema actualizarTema(Tema tema);

    Set<Tema> obtenerTemas();

    Tema obtenerTema(Long temaId);

    Set<Tema> obtenerTemasDelCurso(Curso curso);

    void eliminarTema(Long temaId);

    Tema listarTema(Long temaId);
}
