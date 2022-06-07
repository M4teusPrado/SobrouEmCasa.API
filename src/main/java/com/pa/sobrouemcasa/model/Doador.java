package com.pa.sobrouemcasa.model;

import com.pa.sobrouemcasa.model.enums.GeneroEnum;
import com.pa.sobrouemcasa.model.enums.TipoUsuarioEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;


@Entity
@Getter
@Setter
@PrimaryKeyJoinColumn(name="USER_ID")
public class Doador extends Usuario {

    private String descricao;

    public Doador(Long id, String nome, String senha, TipoUsuarioEnum tipoUsuario, String cpf, String email, GeneroEnum genero, Date dataNascimento, String telefone, String celular, Endereco endereco, String descricao) {
        super(id, nome, senha, tipoUsuario, cpf, email, genero, dataNascimento, telefone, celular, endereco);
        this.descricao = descricao;
    }

    public Doador() {}
}
