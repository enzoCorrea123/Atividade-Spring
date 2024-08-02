package com.escola.escola.service.interfaces;

import com.escola.escola.model.escola.Escola;
import com.escola.escola.model.escola.EscolaDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EscolaServiceInt {
    Escola postEscola(EscolaDTO dto);
    Escola getUmaEscola(Long id);
    List<Escola> getTodasEscolas();
    Escola putEscola(EscolaDTO dto, Long id);
    String deleteEscola(Long id);
}
