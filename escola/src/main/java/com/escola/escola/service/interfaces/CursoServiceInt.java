package com.escola.escola.service.interfaces;

import com.escola.escola.model.aluno.Aluno;
import com.escola.escola.model.aluno.AlunoDTO;
import com.escola.escola.model.curso.Curso;
import com.escola.escola.model.curso.CursoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CursoServiceInt {
    Curso postCurso(CursoDTO dto);
    Curso getUmCurso(Long id);
    List<Curso> getTodosCurso();
    Curso putCurso(CursoDTO dto, Long id);
    String deleteCurso(Long id);
}
