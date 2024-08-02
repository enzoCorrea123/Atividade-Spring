package com.escola.escola.model.escola;
import com.escola.escola.model.curso.Curso;
import com.escola.escola.model.endereco.Endereco;
import com.escola.escola.model.professor.Professor;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Escola {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    @ManyToOne
    private Endereco endereco;
    @OneToMany(mappedBy = "escola")
    @JsonIgnore
    private List<Professor> listaDeProfessores;
    @OneToMany(mappedBy = "escola")
    private List<Curso> listaDeCurso;
}
