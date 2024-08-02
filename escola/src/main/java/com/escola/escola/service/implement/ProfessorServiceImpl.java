package com.escola.escola.service.implement;

import com.escola.escola.model.endereco.Endereco;
import com.escola.escola.model.escola.Escola;
import com.escola.escola.model.professor.Professor;
import com.escola.escola.model.professor.ProfessorDTO;
import com.escola.escola.repository.EnderecoRepository;
import com.escola.escola.repository.EscolaRepository;
import com.escola.escola.repository.ProfessorRepository;
import com.escola.escola.service.interfaces.ProfessorServiceInt;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProfessorServiceImpl implements ProfessorServiceInt {
    private final ProfessorRepository repository;
    private final EscolaRepository escolaRepository;
    private final EnderecoRepository enderecoRepository;
    @Override
    public Professor postProfessor(ProfessorDTO dto) {
        Professor professor = new Professor();
        professor.setNome(dto.nome());
        professor.setEmail(dto.email());
        Endereco endereco = enderecoRepository.findById(dto.endereco().getId()).get();
        Escola escola = escolaRepository.findById(dto.escola().getId()).get();
        professor.setEscola(escola);
        professor.setEndereco(endereco);
        return repository.save(professor);
    }

    @Override
    public Professor getUmProfessor(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Professor> getTodosProfessores() {
        return repository.findAll();
    }

    @Override
    public Professor putProfessor(ProfessorDTO dto, Long id) {
        Professor professor = repository.findById(id).get();
        professor.setNome(dto.nome());
        professor.setEmail(dto.email());
        Endereco endereco = enderecoRepository.findById(dto.endereco().getId()).get();
        Escola escola = escolaRepository.findById(dto.escola().getId()).get();
        professor.setEscola(escola);
        professor.setEndereco(endereco);
        return repository.save(professor);
    }

    @Override
    public String deleteProfessor(Long id) {
        Professor professor = repository.findById(id).get();
        repository.delete(professor);
        return "Professor " + professor.getNome() + " deletado";
    }
}
