package com.escola.escola.service.implement;

import com.escola.escola.model.aluno.Aluno;
import com.escola.escola.model.endereco.Endereco;
import com.escola.escola.model.endereco.EnderecoDTO;
import com.escola.escola.repository.AlunoRepository;
import com.escola.escola.repository.EnderecoRepository;
import com.escola.escola.service.interfaces.EnderecoServiceInt;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EnderecoServiceImpl implements EnderecoServiceInt {
    private final EnderecoRepository repository;
    private final AlunoRepository alunoRepository;

    @Override
    public Endereco postEndereco(EnderecoDTO dto) {
        Endereco endereco = new Endereco(dto);
        return repository.save(endereco);
    }

    @Override
    public Endereco getUmEndereco(Long id) {
        Endereco endereco = repository.findById(id).get();
        return endereco;
    }

    @Override
    public List<Endereco> getTodosEnderecos() {
        List<Endereco> listaDeEnderecos = repository.findAll();
        return listaDeEnderecos;
    }

    @Override
    public Endereco putEndereco(EnderecoDTO dto, Long id) {
        Endereco endereco = repository.findById(id).get();
        endereco.setBairro(dto.bairro());
        endereco.setCep(dto.cep());
        endereco.setCidade(dto.cidade());
        endereco.setNumero(dto.numero());
        endereco.setEstado(dto.estado());
        endereco.setRua(dto.rua());
        return repository.save(endereco);
    }

    @Override
    public String deleteEndereco(Long id) {

        Endereco endereco = repository.findById(id).get();
        List<Aluno> alunos = alunoRepository.findAlunoByEndereco(endereco);
        for(Aluno aluno1 : alunos){
            aluno1.setEndereco(null);
        }
        alunoRepository.saveAll(alunos);
        repository.delete(endereco);
        return "Endereço deletado!" + alunos;
    }
}
