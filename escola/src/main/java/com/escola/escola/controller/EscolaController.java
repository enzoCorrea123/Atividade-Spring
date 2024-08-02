package com.escola.escola.controller;

import com.escola.escola.model.endereco.Endereco;
import com.escola.escola.model.endereco.EnderecoDTO;
import com.escola.escola.model.escola.Escola;
import com.escola.escola.model.escola.EscolaDTO;
import com.escola.escola.service.implement.EnderecoServiceImpl;
import com.escola.escola.service.implement.EscolaServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/escola")
public class EscolaController {
    private final EscolaServiceImpl service;
    @PostMapping
    public ResponseEntity<Escola> postEscola(@RequestBody EscolaDTO dto){
        Escola escola = service.postEscola(dto);
        return new ResponseEntity<>(escola, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Escola> getUmaEscola(@PathVariable Long id){
        return ResponseEntity.ok(service.getUmaEscola(id));
    }
    @GetMapping
    public ResponseEntity<List<Escola>> getTodasEscolas(){
        return ResponseEntity.ok(service.getTodasEscolas());
    }
    @PutMapping("/{id}")
    public ResponseEntity<Escola> putEscolas(@RequestBody EscolaDTO dto, @PathVariable Long id){
        return ResponseEntity.ok(service.putEscola(dto, id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEscolas(@PathVariable Long id){
        return ResponseEntity.ok(service.deleteEscola(id));
    }
}
