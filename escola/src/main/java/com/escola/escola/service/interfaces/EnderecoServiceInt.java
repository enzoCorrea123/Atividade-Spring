package com.escola.escola.service.interfaces;

import com.escola.escola.model.endereco.Endereco;
import com.escola.escola.model.endereco.EnderecoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EnderecoServiceInt {
    Endereco postEndereco(EnderecoDTO dto);
    Endereco getUmEndereco(Long id);
    List<Endereco> getTodosEnderecos();
    Endereco putEndereco(EnderecoDTO dto, Long id);
    String deleteEndereco(Long id);

}
