package com.pa.sobrouemcasa.service;

import com.pa.sobrouemcasa.model.Ong;
import com.pa.sobrouemcasa.model.Usuario;
import com.pa.sobrouemcasa.model.enums.TipoUsuarioEnum;
import com.pa.sobrouemcasa.repository.OngRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class OngService {

    @Autowired
    private OngRepository ongRepository;

    @Autowired
    private UsuarioService usuarioService;

    public Ong saveOng(Ong ong) {
        return ongRepository.save(ong);
    }

    public Usuario getResponsavel(Long idResponsavel) {
        Optional<Usuario> responsavel = usuarioService.getUsuarioById(idResponsavel);

        responsavel.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ID do Responsavel informado não localizado"));
        if(responsavel.get().getTipoUsuario().equals(TipoUsuarioEnum.DOADOR))
            throw new ResponseStatusException( HttpStatus.BAD_REQUEST, "Usuario não é cadastrado como um Responsavel");
        return responsavel.get();
    }

    public Ong cadastroOng(Ong ong, long idResponsavel) {
        ong.setResponsavel(getResponsavel(idResponsavel));
        return saveOng(ong);
    }
}
