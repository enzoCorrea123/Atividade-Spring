package com.escola.escola.model.curso;

import com.escola.escola.model.disciplina.Disciplina;

import java.util.List;

public record CursoDTO(String nome, List<Disciplina> listaDeDisciplinas) {
}
