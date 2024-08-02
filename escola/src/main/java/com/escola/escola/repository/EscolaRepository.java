package com.escola.escola.repository;

import com.escola.escola.model.endereco.Endereco;
import com.escola.escola.model.escola.Escola;
import com.escola.escola.model.turma.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EscolaRepository extends JpaRepository<Escola, Long> {
    List<Escola> findAllByEndereco(Endereco endereco);
}
