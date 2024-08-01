package com.escola.escola.service;

import com.escola.escola.model.aluno.Aluno;
import com.escola.escola.model.aluno.AlunoDTO;
import com.escola.escola.repository.AlunoRepository;
import com.escola.escola.repository.EnderecoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AlunoServiceImpl implements AlunoServiceInt{
    private final AlunoRepository repository;
    private final EnderecoRepository enderecoRepository;
    @Override
    public Aluno postAluno(AlunoDTO dto) {
        System.out.println(dto);
        Aluno aluno = new Aluno(dto);
        aluno.setEndereco(enderecoRepository.findById(dto.endereco().getId()).get());

        return repository.save(aluno);
    }

    @Override
    public Aluno getUmAluno(Long id) {
        Aluno aluno = repository.findById(id).get();
        return aluno;
    }

    @Override
    public List<Aluno> getTodosAlunos() {
        List<Aluno> todos = repository.findAll();
        return todos;

    }

    @Override
    public Aluno putAluno(AlunoDTO dto, Long id) {
        Aluno aluno = repository.findById(id).get();
        aluno.setNome(dto.nome());
        aluno.setEmail(dto.email());
        aluno.setTelefone(dto.telefone());
        aluno.setEndereco(enderecoRepository.findById(dto.endereco().getId()).get());
        return repository.save(aluno);

    }

    @Override
    public String deleteAluno(Long id) {
        Aluno aluno = repository.findById(id).get();
        repository.delete(aluno);
        return "Usuario " + aluno.getNome() + " deletado!";
    }
}
