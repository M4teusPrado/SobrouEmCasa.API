package com.pa.sobrouemcasa.service;

import com.pa.sobrouemcasa.dto.DoadorDTO;
import com.pa.sobrouemcasa.model.Doador;
import com.pa.sobrouemcasa.repository.DoadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class DoadorService {

    @Autowired
    private DoadorRepository doadorRepository;

    public Doador getDoadorById(Long id) {
        Optional<Doador> opDoador = doadorRepository.findById(id);
        return opDoador.orElseThrow( () -> new ResponseStatusException( HttpStatus.NOT_FOUND, "Doador não encontrado"));
    }

    public Doador cadastrarDoador(Doador doador) {
        return doadorRepository.save(doador);
    }

    public Doador updateDoador(Long id, DoadorDTO doadorDTO) {
        try {
            Optional<Doador> doador = doadorRepository.findById(id);

            doador.get().setDescricao(doadorDTO.getDescricao());
            return  cadastrarDoador(doador.get());


        }
        catch(EntityNotFoundException ex){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Administrador não encontrado");
        }
    }
}
