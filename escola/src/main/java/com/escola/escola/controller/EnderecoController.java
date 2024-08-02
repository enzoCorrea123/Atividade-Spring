package com.escola.escola.controller;

import com.escola.escola.model.endereco.Endereco;
import com.escola.escola.model.endereco.EnderecoDTO;
import com.escola.escola.service.implement.EnderecoServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/endereco")
@AllArgsConstructor
public class EnderecoController {
    private final EnderecoServiceImpl service;
    @PostMapping
    public ResponseEntity<Endereco> postEndereco(@RequestBody EnderecoDTO dto){
        Endereco endereco = service.postEndereco(dto);
        return new ResponseEntity<>(endereco, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Endereco> getUmEndereco(@PathVariable Long id){
        return ResponseEntity.ok(service.getUmEndereco(id));
    }
    @GetMapping
    public ResponseEntity<List<Endereco>> getTodosEnderecos(){
        return ResponseEntity.ok(service.getTodosEnderecos());
    }
    @PutMapping("/{id}")
    public ResponseEntity<Endereco> putEnderecos(@RequestBody EnderecoDTO dto, @PathVariable Long id){
        return ResponseEntity.ok(service.putEndereco(dto, id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEnderecos(@PathVariable Long id){
        return ResponseEntity.ok(service.deleteEndereco(id));
    }
}
