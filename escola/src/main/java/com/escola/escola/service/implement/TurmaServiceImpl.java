package com.escola.escola.service.implement;

import com.escola.escola.model.turma.Turma;
import com.escola.escola.model.turma.TurmaDTO;
import com.escola.escola.repository.TurmaRepository;
import com.escola.escola.service.interfaces.TurmaServiceInt;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TurmaServiceImpl implements TurmaServiceInt {
    private TurmaRepository repository;

    @Override
    public Turma postTurma(TurmaDTO dto) {
        Turma turma = new Turma(dto);
        return repository.save(turma);
    }

    @Override
    public Turma getUmaTurma(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Turma> getTodasTurmas() {
        return repository.findAll();
    }

    @Override
    public Turma putTurma(TurmaDTO dto, Long id) {
        Turma turma = repository.findById(id).get();
        turma.setListaDeAlunos(dto.listaDeAlunos());
        turma.setEscola(dto.escola());
        turma.setNome(dto.nome());

        return repository.save(turma);
    }

    @Override
    public String deleteTurma(Long id) {
        Turma turma = repository.findById(id).get();
        repository.delete(turma);

        return "Turma deletada";
    }
}
