package com.pa.sobrouemcasa.service;

import com.pa.sobrouemcasa.dto.UsuarioLoginDTO;
import com.pa.sobrouemcasa.model.Usuario;
import com.pa.sobrouemcasa.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class LoginService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario logar(UsuarioLoginDTO usuarioLoginDTO) {
            Optional<Usuario> opUsuario = usuarioRepository.findOneByEmailIgnoreCaseAndSenha(usuarioLoginDTO.getEmail(), usuarioLoginDTO.getSenha());
            return opUsuario.orElseThrow( () -> new ResponseStatusException( HttpStatus.NOT_FOUND, "Usuario não encontrado"));
    }
}
