package com.pa.sobrouemcasa.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Ong {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    private String cnpj;
    private String finalidadeInstitucional;
    private Date dataConstituicao;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Usuario responsavel;
}
