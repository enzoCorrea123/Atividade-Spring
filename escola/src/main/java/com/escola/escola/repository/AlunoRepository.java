package com.escola.escola.repository;

import com.escola.escola.model.aluno.Aluno;
import com.escola.escola.model.endereco.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    List<Aluno> findAlunoByEndereco(Endereco endereco);
}
