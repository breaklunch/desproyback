package com.descriptores.sistema.servicios;

import com.descriptores.sistema.modelo.Curso;
import com.descriptores.sistema.modelo.Material;

import java.util.Set;

public interface MaterialService {
    Material agregarMaterial(Material material);

    Material actualizarMaterial(Material material);

    Set<Material> obtenerMateriales();

    Material obtenerMaterial(Long materialId);

    Set<Material> obtenerMaterialesDelCurso(Curso curso);

    void eliminarMaterial(Long materialId);

    Material listarMaterial(Long materialId);
}
