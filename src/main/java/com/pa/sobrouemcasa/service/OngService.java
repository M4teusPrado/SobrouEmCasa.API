package com.pa.sobrouemcasa.service;

import com.pa.sobrouemcasa.model.Ong;
import com.pa.sobrouemcasa.repository.OngRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OngService {

    @Autowired
    private OngRepository ongRepository;

    public Ong SaveOng(Ong ong) {
        return ongRepository.save(ong);
    }
}
