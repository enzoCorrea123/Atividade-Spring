package com.escola.escola.model.professor;

import com.escola.escola.model.disciplina.Disciplina;
import com.escola.escola.model.endereco.Endereco;
import com.escola.escola.model.escola.Escola;

public record ProfessorDTO(String nome, String email, String telefone, Escola escola, Endereco endereco) {
}
