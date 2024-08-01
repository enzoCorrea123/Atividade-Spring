package com.escola.escola.service;

import com.escola.escola.model.aluno.Aluno;
import com.escola.escola.model.aluno.AlunoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AlunoServiceInt {

    Aluno postAluno(AlunoDTO dto);
    Aluno getUmAluno(Long id);
    List<Aluno> getTodosAlunos();
    Aluno putAluno(AlunoDTO dto, Long id);
    String deleteAluno(Long id);
}
