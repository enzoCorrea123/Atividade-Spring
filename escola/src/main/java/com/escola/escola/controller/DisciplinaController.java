package com.escola.escola.controller;

import com.escola.escola.model.disciplina.Disciplina;
import com.escola.escola.model.disciplina.DisciplinaPostDTO;
import com.escola.escola.model.disciplina.DisciplinaPutDTO;
import com.escola.escola.service.implement.DisciplinaServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disciplina")
@AllArgsConstructor
public class DisciplinaController {
    private final DisciplinaServiceImpl service;
    @PostMapping
    public ResponseEntity<Disciplina> postDisciplina(@RequestBody DisciplinaPostDTO dto){
        return ResponseEntity.ok(service.postDisciplina(dto));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Disciplina> getDisciplina(@PathVariable Long id){
        return ResponseEntity.ok(service.getUmaDisciplina(id));
    }
    @GetMapping
    public ResponseEntity<List<Disciplina>> getDisciplinas(){
        return ResponseEntity.ok(service.getTodasDisciplinas());
    }
    @PutMapping("/{id}")
    public ResponseEntity<Disciplina> putDisciplina(@RequestBody DisciplinaPutDTO dto, @PathVariable Long id){
        return ResponseEntity.ok(service.putDisciplina(dto, id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDisciplina(@PathVariable Long id){
        return ResponseEntity.ok(service.deleteDisciplina(id));
    }
}
