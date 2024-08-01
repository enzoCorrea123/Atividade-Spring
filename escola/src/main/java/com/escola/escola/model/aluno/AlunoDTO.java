package com.escola.escola.model.aluno;

import com.escola.escola.model.endereco.Endereco;

public record AlunoDTO(String nome, String email, String telefone, Endereco endereco) {
}
