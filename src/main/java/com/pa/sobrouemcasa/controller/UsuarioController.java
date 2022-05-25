package com.pa.sobrouemcasa.controller;

import com.pa.sobrouemcasa.model.Usuario;
import com.pa.sobrouemcasa.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping()
    public List<Usuario> getUsuarios() {
        return usuarioService.getUsuarios();
    }

    @PostMapping()
    public ResponseEntity<Usuario> saveUsuario(@Valid @RequestBody Usuario usuario) {
        Usuario usuarioAux = usuarioService.saveUsuario(usuario);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(usuarioAux.getId()).toUri();
        return ResponseEntity.created(uri).body(usuarioAux);
    }
}
