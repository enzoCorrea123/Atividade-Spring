package com.escola.escola.controller;

import com.escola.escola.model.escola.Escola;
import com.escola.escola.model.escola.EscolaDTO;
import com.escola.escola.model.professor.Professor;
import com.escola.escola.model.professor.ProfessorDTO;
import com.escola.escola.service.implement.ProfessorServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/professor")
public class ProfessorController {
    private final ProfessorServiceImpl service;
    @PostMapping
    public ResponseEntity<Professor> postProfessor(@RequestBody ProfessorDTO dto){
        Professor professor = service.postProfessor(dto);
        return new ResponseEntity<>(professor, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Professor> getUmProfessor(@PathVariable Long id){
        return ResponseEntity.ok(service.getUmProfessor(id));
    }
    @GetMapping
    public ResponseEntity<List<Professor>> getTodosProfessores(){
        return ResponseEntity.ok(service.getTodosProfessores());
    }
    @PutMapping("/{id}")
    public ResponseEntity<Professor> putProfessor(@RequestBody ProfessorDTO dto, @PathVariable Long id){
        return ResponseEntity.ok(service.putProfessor(dto, id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProfessor(@PathVariable Long id){
        return ResponseEntity.ok(service.deleteProfessor(id));
    }
}
