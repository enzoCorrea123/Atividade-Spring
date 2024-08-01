package com.escola.escola.model.curso;
import com.escola.escola.model.disciplina.Disciplina;
import com.escola.escola.model.escola.Escola;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToMany(mappedBy = "curso")
    private List<Disciplina> listaDeDisciplinas;
    @ManyToOne
    private Escola escola;
}
