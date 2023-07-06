package com.descriptores.sistema.servicios.impl;

import com.descriptores.sistema.modelo.Curso;
import com.descriptores.sistema.modelo.Material;
import com.descriptores.sistema.repositorios.MaterialRepository;
import com.descriptores.sistema.servicios.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MaterialServiceImpl implements MaterialService{
    @Autowired
    private MaterialRepository materialRepository;

    @Override
    public Material agregarMaterial(Material material) {
        return materialRepository.save(material);
    }

    @Override
    public Material actualizarMaterial(Material material) {
        return materialRepository.save(material);
    }

    @Override
    public Set<Material> obtenerMateriales() {
        return (Set<Material>) materialRepository.findAll();
    }

    @Override
    public Material obtenerMaterial(Long materialId) {
        return materialRepository.findById(materialId).get();
    }

    @Override
    public Set<Material> obtenerMaterialesDelCurso(Curso curso) {
        return materialRepository.findByCurso(curso);
    }

    @Override
    public void eliminarMaterial(Long materialId) {
        Material material = new Material();
        material.setMaterialId(materialId);
        materialRepository.delete(material);
    }

    @Override
    public Material listarMaterial(Long materialId) {
        return this.materialRepository.getOne(materialId);
    }
}
