package com.descriptores.sistema.servicios.impl;

import com.descriptores.sistema.modelo.Curso;
import com.descriptores.sistema.modelo.Tema;
import com.descriptores.sistema.repositorios.TemaRepository;
import com.descriptores.sistema.servicios.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class TemaServiceImpl implements TemaService {
    @Autowired
    private TemaRepository temaRepository;

    @Override
    public Tema agregarTema(Tema tema) {
        return temaRepository.save(tema);
    }

    @Override
    public Tema actualizarTema(Tema tema) {
        return temaRepository.save(tema);
    }

    @Override
    public Set<Tema> obtenerTemas() {
        return (Set<Tema>) temaRepository.findAll();
    }

    @Override
    public Tema obtenerTema(Long temaId) {
        return temaRepository.findById(temaId).get();
    }

    @Override
    public Set<Tema> obtenerTemasDelCurso(Curso curso) {
        return temaRepository.findByCurso(curso);
    }

    @Override
    public void eliminarTema(Long temaId) {
        Tema tema = new Tema();
        tema.setTemaId(temaId);
        temaRepository.delete(tema);
    }

    @Override
    public Tema listarTema(Long temaId) {
        return this.temaRepository.getOne(temaId);
    }
}
