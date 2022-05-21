 package com.pa.sobrouemcasa.controller;

import com.pa.sobrouemcasa.dto.UsuarioLoginDTO;
import com.pa.sobrouemcasa.model.Usuario;
import com.pa.sobrouemcasa.service.LoginService;
import com.pa.sobrouemcasa.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping()
    public String index() {
        return null;
    }

    @PostMapping()
    public ResponseEntity<Usuario> logar(@RequestBody UsuarioLoginDTO usuarioLoginDTO) {
        return ResponseEntity.ok().body(loginService.logar(usuarioLoginDTO));
    }
}
