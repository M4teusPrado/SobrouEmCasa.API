package com.pa.sobrouemcasa.repository;

import com.pa.sobrouemcasa.model.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


}
