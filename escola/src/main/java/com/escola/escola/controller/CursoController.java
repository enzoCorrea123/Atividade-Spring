package com.escola.escola.controller;

import com.escola.escola.model.curso.Curso;
import com.escola.escola.model.curso.CursoDTO;
import com.escola.escola.service.implement.CursoServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
@AllArgsConstructor
public class CursoController {
    private final CursoServiceImpl service;
    @PostMapping
    public ResponseEntity<Curso> postCurso(@RequestBody CursoDTO dto){
        return ResponseEntity.ok(service.postCurso(dto));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Curso> getUmCurso(@PathVariable Long id){
        return ResponseEntity.ok(service.getUmCurso(id));
    }
    @GetMapping
    public ResponseEntity<List<Curso>> getTodosCursos(){
        return ResponseEntity.ok(service.getTodosCurso());
    }
    @PutMapping("/{id}")
    public ResponseEntity<Curso> putCurso(@RequestBody CursoDTO dto, @PathVariable Long id){
        return ResponseEntity.ok(service.putCurso(dto, id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCurso(@PathVariable Long id){
        return ResponseEntity.ok(service.deleteCurso(id));
    }
}
