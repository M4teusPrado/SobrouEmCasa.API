package com.pa.sobrouemcasa.controller;

import com.pa.sobrouemcasa.model.Ong;
import com.pa.sobrouemcasa.service.OngService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/ong")
public class OngController {

    @Autowired
    private OngService ongService;

    @PostMapping("/{idResponsavel}")
    public ResponseEntity<Ong> cadastrar(@PathVariable Long idResponsavel, @Valid @RequestBody Ong ong) {
        return ResponseEntity.ok().body(ongService.cadastroOng(ong,idResponsavel));
    }
}
