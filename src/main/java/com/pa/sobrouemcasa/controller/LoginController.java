 package com.pa.sobrouemcasa.controller;

import com.pa.sobrouemcasa.dto.UsuarioLoginDTO;
import com.pa.sobrouemcasa.model.Doador;
import com.pa.sobrouemcasa.model.Ong;
import com.pa.sobrouemcasa.model.Usuario;
import com.pa.sobrouemcasa.service.DoadorService;
import com.pa.sobrouemcasa.service.LoginService;
import com.pa.sobrouemcasa.service.OngService;
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
    private DoadorService doadorService;

    @Autowired
    private OngService ongService;

    @PostMapping()
    public ResponseEntity<Usuario> logar(@RequestBody UsuarioLoginDTO usuarioLoginDTO) {
        return ResponseEntity.ok().body(loginService.logar(usuarioLoginDTO));
    }

    @PostMapping("/cadastrar/pf")
    public ResponseEntity<Doador> cadastrar(@Valid @RequestBody Doador doador) {
        return ResponseEntity.ok().body(doadorService.cadastrarDoador(doador));
    }

    @PostMapping("cadastrar/pj")
    public ResponseEntity<Ong> cadastrar(@Valid @RequestBody Ong ong) {
        return ResponseEntity.ok().body(ongService.cadastroOng(ong));
    }
}
