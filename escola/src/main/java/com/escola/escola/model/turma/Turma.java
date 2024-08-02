package com.escola.escola.model.turma;

import com.escola.escola.model.aluno.Aluno;
import com.escola.escola.model.escola.Escola;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToOne
    private Escola escola;
    @OneToMany
    private List<Aluno> listaDeAlunos;

    public Turma(TurmaDTO dto){
        BeanUtils.copyProperties(dto,this);
    }
}
