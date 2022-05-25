 package com.pa.sobrouemcasa.controller;

import com.pa.sobrouemcasa.dto.UsuarioLoginDTO;
import com.pa.sobrouemcasa.model.Usuario;
import com.pa.sobrouemcasa.service.LoginService;
import com.pa.sobrouemcasa.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private UsuarioService usuarioService ;

    @PostMapping("/cadastrar")
    public ResponseEntity<Usuario> cadastrar(@Valid @RequestBody Usuario usuario) {
        return ResponseEntity.ok().body(usuarioService.saveUsuario(usuario));
    }

    @PostMapping()
    public ResponseEntity<Usuario> logar(@RequestBody UsuarioLoginDTO usuarioLoginDTO) {
        return ResponseEntity.ok().body(loginService.logar(usuarioLoginDTO));
    }
}
