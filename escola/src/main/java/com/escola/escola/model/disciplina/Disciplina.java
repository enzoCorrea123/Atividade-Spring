package com.escola.escola.model.disciplina;

import com.escola.escola.model.curso.Curso;
import com.escola.escola.model.professor.Professor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @ManyToMany(mappedBy = "listaDeDisciplinas")
    private List<Professor> listaDeProfessores;
    @ManyToOne
    private Curso curso;
}
