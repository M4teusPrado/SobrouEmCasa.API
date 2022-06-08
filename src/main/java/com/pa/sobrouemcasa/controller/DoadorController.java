package com.pa.sobrouemcasa.controller;

import com.pa.sobrouemcasa.dto.DoadorDTO;
import com.pa.sobrouemcasa.dto.UsuarioLoginDTO;
import com.pa.sobrouemcasa.model.Doador;
import com.pa.sobrouemcasa.model.Usuario;
import com.pa.sobrouemcasa.service.DoadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doador")
public class DoadorController {

    @Autowired
    private DoadorService doadorService;

    @PutMapping("{id}")
    public ResponseEntity<Doador> updateDoador(@PathVariable Long id,  @RequestBody DoadorDTO doador) {
        return ResponseEntity.ok().body(doadorService.updateDoador(id,doador));
    }
}