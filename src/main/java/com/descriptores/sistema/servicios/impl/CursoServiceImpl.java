package com.descriptores.sistema.servicios.impl;

import com.descriptores.sistema.modelo.Categoria;
import com.descriptores.sistema.modelo.Curso;
import com.descriptores.sistema.repositorios.CursoRepository;

import com.descriptores.sistema.servicios.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Service
public class CursoServiceImpl implements CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public Curso agregarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public Curso actualizarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public Set<Curso> obtenerCursos() {
        return new LinkedHashSet<>(cursoRepository.findAll());
    }

    @Override
    public Curso obtenerCurso(Long Id) {
        return cursoRepository.findById(Id).get();
    }

    @Override
    public void eliminarCurso(Long cursoId) {
        Curso curso = new Curso();
        curso.setCursoId(cursoId);;
        cursoRepository.delete(curso);
    }

    @Override
    public List<Curso> listarCursosDeUnaCategoria(Categoria categoria) {
        return this.cursoRepository.findByCategoria(categoria);
    }

    @Override
    public List<Curso> obtenerCursosActivos() {
        return cursoRepository.findByActivo(true);
    }

    @Override
    public List<Curso> obtenerCursosActivosDeUnaCategoria(Categoria categoria) {
        return cursoRepository.findByCategoriaAndActivo(categoria,true);
    }
}
