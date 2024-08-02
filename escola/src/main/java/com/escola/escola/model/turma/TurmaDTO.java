package com.escola.escola.model.turma;

import com.escola.escola.model.aluno.Aluno;
import com.escola.escola.model.escola.Escola;

import java.util.List;

public record TurmaDTO(String nome, Escola escola, List<Aluno> listaDeAlunos) {
}
