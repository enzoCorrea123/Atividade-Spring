package com.escola.escola.model.disciplina;

import com.escola.escola.model.professor.Professor;

import java.util.List;

public record DisciplinaPutDTO(String nome, List<Professor> listaDeProfessores) {
}
