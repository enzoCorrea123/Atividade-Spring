package com.escola.escola.controller;

import com.escola.escola.model.aluno.Aluno;
import com.escola.escola.model.aluno.AlunoDTO;
import com.escola.escola.service.AlunoServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/aluno")
public class AlunoController {
    private final AlunoServiceImpl service;
    @PostMapping
    public ResponseEntity<Aluno> postAluno(@RequestBody AlunoDTO dto){
        Aluno aluno = service.postAluno(dto);
        return new ResponseEntity<>(aluno, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Aluno> getAluno(@PathVariable Long id){
        Aluno aluno = service.getUmAluno(id);
        return new ResponseEntity<>(aluno, HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Aluno>> getTodosAlunos(){
        List<Aluno> listaDeAlunos = service.getTodosAlunos();
        return new ResponseEntity<>(listaDeAlunos, HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Aluno> putAluno(@RequestBody AlunoDTO dto, @PathVariable Long id){
        Aluno aluno = service.putAluno(dto, id);
        return new ResponseEntity<>(aluno, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAluno(@PathVariable Long id){
        String mensagem = service.deleteAluno(id);
        return new ResponseEntity<>(mensagem,HttpStatus.OK);

    }

}
