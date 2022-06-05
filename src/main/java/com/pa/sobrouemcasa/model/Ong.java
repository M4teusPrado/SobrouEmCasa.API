package com.pa.sobrouemcasa.model;

import com.pa.sobrouemcasa.model.enums.GeneroEnum;
import com.pa.sobrouemcasa.model.enums.TipoUsuarioEnum;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Entity
@Getter
@Setter
@PrimaryKeyJoinColumn(name="USER_ID")
public class Ong extends Usuario {

    private String nomeInstituicao;
    private String cnpj;
    private String finalidadeInstitucional;
    private Date dataConstituicao;

    public Ong() {}

    public Ong(Long id, String nome, String senha, TipoUsuarioEnum tipoUsuario, String cpf, String email, GeneroEnum genero, Date dataNascimento, String telefone, String celular, Endereco endereco, String nomeInstituicao, String cnpj, String finalidadeInstitucional, Date dataConstituicao) {
        super(id, nome, senha, tipoUsuario, cpf, email, genero, dataNascimento, telefone, celular, endereco);
        this.nomeInstituicao = nomeInstituicao;
        this.cnpj = cnpj;
        this.finalidadeInstitucional = finalidadeInstitucional;
        this.dataConstituicao = dataConstituicao;
    }
}
