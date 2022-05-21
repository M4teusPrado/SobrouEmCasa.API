package com.pa.sobrouemcasa.model;

import com.pa.sobrouemcasa.model.enums.GeneroEnum;
import com.pa.sobrouemcasa.model.enums.TipoUsuarioEnum;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String login;
    private String senha;
    private TipoUsuarioEnum tipoUsuario;
    private String cpf;
    private String email;
    private GeneroEnum genero;
    private Date dataNascimento;
    private String telefone;
    private String celular;

}
