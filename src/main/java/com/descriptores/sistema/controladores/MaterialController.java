package com.descriptores.sistema.controladores;

import com.descriptores.sistema.modelo.Curso;
import com.descriptores.sistema.modelo.Material;
import com.descriptores.sistema.servicios.CursoService;
import com.descriptores.sistema.servicios.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/material")
@CrossOrigin("*")
public class MaterialController {
    @Autowired
    private MaterialService materialService;

    @Autowired
    private CursoService cursoService;

    @PostMapping("/")
    public ResponseEntity<Material> guardarMaterial(@RequestBody Material material){
        return ResponseEntity.ok(materialService.agregarMaterial(material));
    }

    @PutMapping("/")
    public ResponseEntity<Material> actualizarMaterial(@RequestBody Material material){
        return ResponseEntity.ok(materialService.actualizarMaterial(material));
    }

    @GetMapping("/curso/{cursoId}")
    public ResponseEntity<?> listarMaterialesDelCurso(@PathVariable("cursoId") Long cursoId){
        Curso curso = cursoService.obtenerCurso(cursoId);
        Set<Material> materiales = curso.getMateriales();
        List cursos = new ArrayList(materiales);
        Collections.shuffle(cursos);
        return ResponseEntity.ok(cursos);
    }

    @GetMapping("/{materialid}")
    public Material listarMaterialPorId(@PathVariable("materialId") Long materialId){
        return materialService.obtenerMaterial(materialId);
    }

    @DeleteMapping("/{materialid}")
    public void eliminarMaterial(@PathVariable("materialid") Long materialid) {
        materialService.eliminarMaterial(materialid);
    }

    @GetMapping("/curso/todos/{cursoId}")
    public ResponseEntity<?> listarMaterialDelCursoComoAdministrador(@PathVariable("cursoId") Long cursoId){
        Curso curso = new Curso();
        curso.setCursoId(cursoId);
        Set<Material> materiales = materialService.obtenerMaterialesDelCurso(curso);
        return ResponseEntity.ok(materiales);
    }
}
