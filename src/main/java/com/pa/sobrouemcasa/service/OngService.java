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

    public Ong cadastroOng(Ong ong) {
        return saveOng(ong);
    }
}
