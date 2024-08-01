package com.escola.escola.repository;

import com.escola.escola.model.disciplina.Disciplina;
import com.escola.escola.model.turma.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
}
