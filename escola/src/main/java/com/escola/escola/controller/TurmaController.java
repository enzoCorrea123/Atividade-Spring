package com.escola.escola.controller;

import com.escola.escola.model.turma.Turma;
import com.escola.escola.model.turma.TurmaDTO;
import com.escola.escola.service.implement.TurmaServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/turma")
public class TurmaController {
    private final TurmaServiceImpl service;

    @PostMapping
    public ResponseEntity<Turma> postTurma(@RequestBody TurmaDTO dto){
        return ResponseEntity.ok(service.postTurma(dto));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Turma> getUmaTurma(@PathVariable Long id){
        return ResponseEntity.ok(service.getUmaTurma(id));
    }
    @GetMapping
    public ResponseEntity<List<Turma>> getTodasTurmas(){
        return ResponseEntity.ok(service.getTodasTurmas());
    }
    @PutMapping("/{id}")
    public ResponseEntity<Turma> putTurma(@RequestBody TurmaDTO dto, @PathVariable Long id){
        return ResponseEntity.ok(service.putTurma(dto, id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTurma(@PathVariable Long id){
        return ResponseEntity.ok(service.deleteTurma(id));
    }
}
