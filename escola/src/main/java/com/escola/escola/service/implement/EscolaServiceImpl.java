package com.escola.escola.service.implement;

import com.escola.escola.model.curso.Curso;
import com.escola.escola.model.endereco.Endereco;
import com.escola.escola.model.escola.Escola;
import com.escola.escola.model.escola.EscolaDTO;
import com.escola.escola.repository.CursoRepository;
import com.escola.escola.repository.EnderecoRepository;
import com.escola.escola.repository.EscolaRepository;
import com.escola.escola.service.interfaces.EscolaServiceInt;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EscolaServiceImpl implements EscolaServiceInt {
    private final CursoRepository cursoRepository;
    private final EnderecoRepository enderecoRepository;
    private final EscolaRepository repository;
    @Override
    public Escola postEscola(EscolaDTO dto) {
        Escola escola = new Escola();
        escola.setNome(dto.nome());
        escola.setEmail(dto.email());
        List<Curso> listaDeCursos = cursoRepository.findAllById(dto.listaDeCursos().stream().map(curso -> curso.getId()).toList());
        Endereco endereco = enderecoRepository.findById(dto.endereco().getId()).get();
        escola.setEndereco(endereco);
        escola.setListaDeCurso(listaDeCursos);
        return repository.save(escola);
    }

    @Override
    public Escola getUmaEscola(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Escola> getTodasEscolas() {
        return repository.findAll();
    }

    @Override
    public Escola putEscola(EscolaDTO dto, Long id) {
        Escola escola = repository.findById(id).get();
        escola.setNome(dto.nome());
        escola.setEmail(dto.email());
        List<Curso> listaDeCursos = cursoRepository.findAllById(dto.listaDeCursos().stream().map(curso -> curso.getId()).toList());
        Endereco endereco = enderecoRepository.findById(dto.endereco().getId()).get();
        escola.setEndereco(endereco);
        escola.setListaDeCurso(listaDeCursos);
        return repository.save(escola);

    }

    @Override
    public String deleteEscola(Long id) {
        Escola escola = repository.findById(id).get();
        repository.delete(escola);
        return "Escola " + escola.getNome() + " deletada";
    }
}
