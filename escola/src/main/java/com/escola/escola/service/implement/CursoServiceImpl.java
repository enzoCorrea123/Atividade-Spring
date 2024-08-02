package com.escola.escola.service.implement;

import com.escola.escola.model.curso.Curso;
import com.escola.escola.model.curso.CursoDTO;
import com.escola.escola.model.disciplina.Disciplina;
import com.escola.escola.repository.CursoRepository;
import com.escola.escola.repository.DisciplinaRepository;
import com.escola.escola.service.interfaces.CursoServiceInt;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CursoServiceImpl implements CursoServiceInt {
    private final CursoRepository repository;
    private final DisciplinaRepository disciplinaRepository;
    @Override
    public Curso postCurso(CursoDTO dto) {
        Curso curso = new Curso();
        curso.setNome(dto.nome());
//        List<Disciplina> listaDeDisciplina = disciplinaRepository.findAllById(dto.listaDeDisciplinas().stream().map(disciplina -> disciplina.getId()).toList());
//        curso.setListaDeDisciplinas(listaDeDisciplina);
        curso.setListaDeDisciplinas(dto.listaDeDisciplinas());
        return repository.save(curso);
    }

    @Override
    public Curso getUmCurso(Long id) {
        Curso curso = repository.findById(id).get();
        return curso;
    }

    @Override
    public List<Curso> getTodosCurso() {
        return repository.findAll();
    }

    @Override
    public Curso putCurso(CursoDTO dto, Long id) {
        Curso curso = repository.findById(id).get();
        curso.setNome(dto.nome());
        curso.setListaDeDisciplinas(dto.listaDeDisciplinas());
        return repository.save(curso);
    }

    @Override
    public String deleteCurso(Long id) {
        Curso curso = repository.findById(id).get();
        repository.delete(curso);
        return "Curso "+ curso.getNome() + "deletado";
    }
}
