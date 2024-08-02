package com.escola.escola.service.interfaces;

import com.escola.escola.model.professor.Professor;
import com.escola.escola.model.professor.ProfessorDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProfessorServiceInt {
    Professor postProfessor(ProfessorDTO dto);
    Professor getUmProfessor(Long id);
    List<Professor> getTodosProfessores();
    Professor putProfessor(ProfessorDTO dto, Long id);
    String deleteProfessor(Long id);
}
