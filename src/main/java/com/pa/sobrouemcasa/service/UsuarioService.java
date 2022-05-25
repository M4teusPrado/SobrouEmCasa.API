package com.pa.sobrouemcasa.service;

import com.pa.sobrouemcasa.repository.UsuarioRepository;
import com.pa.sobrouemcasa.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getUsuarios() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> getUsuarioByEmail(Usuario usuario) { return usuarioRepository.findByEmail(usuario.getEmail());}
    public Optional<Usuario> getUsuarioByCpf(Usuario usuario) { return usuarioRepository.findByCpf(usuario.getCpf());}

    public Usuario saveUsuario(Usuario usuario) {

        if(getUsuarioByEmail(usuario).isPresent()) throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Email ja cadastrado");
        if(getUsuarioByCpf(usuario).isPresent()) throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "CPF ja cadastrado");

        return usuarioRepository.save(usuario);
    }
}
