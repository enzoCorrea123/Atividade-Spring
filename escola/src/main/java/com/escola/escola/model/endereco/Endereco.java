package com.escola.escola.model.endereco;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private Long numero;
    private Long cep;

    public Endereco(EnderecoDTO dto){
        BeanUtils.copyProperties(dto,this);
    }
}
