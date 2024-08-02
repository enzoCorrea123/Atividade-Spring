package com.escola.escola.service.interfaces;

import com.escola.escola.model.disciplina.Disciplina;
import com.escola.escola.model.disciplina.DisciplinaPostDTO;
import com.escola.escola.model.disciplina.DisciplinaPutDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DisciplinaServiceInt {
    Disciplina postDisciplina(DisciplinaPostDTO dto);
    Disciplina getUmaDisciplina(Long id);
    List<Disciplina> getTodasDisciplinas();
    Disciplina putDisciplina(DisciplinaPutDTO dto, Long id);
    String deleteDisciplina(Long id);
}
