package com.pa.sobrouemcasa.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Endereco {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    private String cep;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private long numero;
}
