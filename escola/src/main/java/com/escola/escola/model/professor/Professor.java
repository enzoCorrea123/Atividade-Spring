package com.escola.escola.model.professor;

import com.escola.escola.model.disciplina.Disciplina;
import com.escola.escola.model.endereco.Endereco;
import com.escola.escola.model.escola.Escola;
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
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    @ManyToOne
    private Escola escola;
    @ManyToMany
    @JoinTable(
            name = "professor_disciplina",
            joinColumns = @JoinColumn(name = "professor_id"),
            inverseJoinColumns = @JoinColumn(name = "disciplina_id"))
    @JsonIgnore
    private List<Disciplina> listaDeDisciplinas;
    @OneToOne
    private Endereco endereco;

}
