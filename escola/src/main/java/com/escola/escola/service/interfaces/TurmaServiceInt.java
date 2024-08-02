package com.escola.escola.service.interfaces;

import com.escola.escola.model.disciplina.Disciplina;
import com.escola.escola.model.disciplina.DisciplinaPostDTO;
import com.escola.escola.model.disciplina.DisciplinaPutDTO;
import com.escola.escola.model.turma.Turma;
import com.escola.escola.model.turma.TurmaDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TurmaServiceInt {
    Turma postTurma(TurmaDTO dto);
    Turma getUmaTurma(Long id);
    List<Turma> getTodasTurmas();
    Turma putTurma(TurmaDTO dto, Long id);
    String deleteTurma(Long id);
}
