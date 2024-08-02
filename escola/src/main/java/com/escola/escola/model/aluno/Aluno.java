package com.escola.escola.model.aluno;

import com.escola.escola.model.endereco.Endereco;
import com.escola.escola.model.turma.Turma;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Endereco endereco;
    @ManyToOne
    private Turma turma;
    public Aluno(AlunoDTO dto){
        this.setNome(dto.nome());
        this.setEmail(dto.email());
        this.setTelefone(dto.telefone());


    }
}
