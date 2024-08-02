package com.escola.escola.model.escola;

import com.escola.escola.model.curso.Curso;
import com.escola.escola.model.endereco.Endereco;

import java.util.List;

public record EscolaDTO(String nome, Endereco endereco, String email, List<Curso> listaDeCursos) {
}
