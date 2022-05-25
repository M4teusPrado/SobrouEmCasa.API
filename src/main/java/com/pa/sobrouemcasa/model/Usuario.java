package com.pa.sobrouemcasa.model;

import com.pa.sobrouemcasa.model.enums.GeneroEnum;
import com.pa.sobrouemcasa.model.enums.TipoUsuarioEnum;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "{nome.not.blank}")
    private String nome;
    private String senha;
    private TipoUsuarioEnum tipoUsuario;
    private String cpf;
    @NotBlank(message = "{email.not.blank}")
    private String email;
    private GeneroEnum genero;
    private Date dataNascimento;
    private String telefone;
    private String celular;

}
