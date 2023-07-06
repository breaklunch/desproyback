package com.descriptores.sistema.controladores;

import com.descriptores.sistema.modelo.Categoria;
import com.descriptores.sistema.modelo.Curso;
import com.descriptores.sistema.servicios.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
@CrossOrigin("*")
public class CursoController {
    @Autowired
    private CursoService cursoService;

    @PostMapping("/")
    public ResponseEntity<Curso> guardarCurso(@RequestBody Curso curso){
        return ResponseEntity.ok(cursoService.agregarCurso(curso));
    }

    @PutMapping("/")
    public ResponseEntity<Curso> actualizarCurso(@RequestBody Curso curso){
        return ResponseEntity.ok(cursoService.actualizarCurso(curso));
    }

    @GetMapping("/")
    public ResponseEntity<?> listarCursos(){
        return ResponseEntity.ok(cursoService.obtenerCursos());
    }

    @GetMapping("/{cursoId}")
    public Curso listarCurso(@PathVariable("cursoId") Long cursoId){
        return cursoService.obtenerCurso(cursoId);
    }

    @DeleteMapping("/{cursoId}")
    public void eliminarCurso(@PathVariable("cursoId") Long cursoId){
        cursoService.eliminarCurso(cursoId);
    }

    @GetMapping("/categoria/{categoriaId}")
    public List<Curso> listarCursosDeUnaCategoria(@PathVariable("categoriaId") Long categoriaId){
        Categoria categoria = new Categoria();
        categoria.setCategoriaId(categoriaId);
        return cursoService.listarCursosDeUnaCategoria(categoria);
    }

    @GetMapping("/activo")
    public List<Curso> listarCursosActivos(){
        return cursoService.obtenerCursosActivos();
    }

    @GetMapping("/categoria/activo/{categoriaId}")
    public List<Curso> listarCursosActivosDeUnaCategoria(@PathVariable("categoriaId") Long categoriaId){
        Categoria categoria = new Categoria();
        categoria.setCategoriaId(categoriaId);
        return cursoService.obtenerCursosActivosDeUnaCategoria(categoria);
    }
}
