package com.escola.escola.service.implement;

import com.escola.escola.model.disciplina.Disciplina;
import com.escola.escola.model.disciplina.DisciplinaPostDTO;
import com.escola.escola.model.disciplina.DisciplinaPutDTO;
import com.escola.escola.model.professor.Professor;
import com.escola.escola.repository.DisciplinaRepository;
import com.escola.escola.repository.ProfessorRepository;
import com.escola.escola.service.interfaces.DisciplinaServiceInt;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DisciplinaServiceImpl implements DisciplinaServiceInt {
    private final DisciplinaRepository repository;
    private final ProfessorRepository professorRepository;
    @Override
    public Disciplina postDisciplina(DisciplinaPostDTO dto) {
        Disciplina disciplina = new Disciplina(dto);
        return repository.save(disciplina);
    }

    @Override
    public Disciplina getUmaDisciplina(Long id) {
        Disciplina disciplina = repository.findById(id).get();
        return disciplina;
    }

    @Override
    public List<Disciplina> getTodasDisciplinas() {
        return repository.findAll();
    }

    @Override
    public Disciplina putDisciplina(DisciplinaPutDTO dto, Long id) {
        Disciplina disciplina = getUmaDisciplina(id);
        disciplina.setListaDeProfessores(dto.listaDeProfessores());
        disciplina.setNome(dto.nome());
        return repository.save(disciplina);
    }

    @Override
    public String deleteDisciplina(Long id) {
        repository.delete(repository.findById(id).get());
        return "Disciplina deletada";
    }
}
