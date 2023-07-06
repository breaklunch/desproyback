package com.descriptores.sistema.controladores;

import com.descriptores.sistema.modelo.Curso;
import com.descriptores.sistema.modelo.Tema;
import com.descriptores.sistema.servicios.CursoService;
import com.descriptores.sistema.servicios.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/tema")
@CrossOrigin("*")
public class TemaController {
    @Autowired
    private TemaService temaService;

    @Autowired
    private CursoService cursoService;

    @PostMapping("/")
    public ResponseEntity<Tema> guardarTema(@RequestBody Tema tema){
        return ResponseEntity.ok(temaService.agregarTema(tema));
    }

    @PutMapping("/")
    public ResponseEntity<Tema> actualizarTema(@RequestBody Tema tema){
        return ResponseEntity.ok(temaService.actualizarTema(tema));
    }

    @GetMapping("/curso/{cursoId}")
    public ResponseEntity<?> listarTemasDelCurso(@PathVariable("cursoId") Long cursoId){
        Curso curso = cursoService.obtenerCurso(cursoId);
        Set<Tema> temas = curso.getTemas();
        List cursos = new ArrayList(temas);
        Collections.shuffle(cursos);
        return ResponseEntity.ok(cursos);
    }

    @GetMapping("/{temaId}")
    public Tema listarTemaPorId(@PathVariable("temaId") Long temaId){
        return temaService.obtenerTema(temaId);
    }

    @DeleteMapping("/{temaId}")
    public void eliminarTema(@PathVariable("temaId") Long temaId) {
       temaService.eliminarTema(temaId);
    }

    @GetMapping("/curso/todos/{cursoId}")
    public ResponseEntity<?> listarTemaDelCursoComoAdministrador(@PathVariable("cursoId") Long cursoId){
        Curso curso = new Curso();
        curso.setCursoId(cursoId);
        Set<Tema> temas = temaService.obtenerTemasDelCurso(curso);
        return ResponseEntity.ok(temas);
    }

}
