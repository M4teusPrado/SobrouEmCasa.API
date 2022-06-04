package com.pa.sobrouemcasa.repository;

import com.pa.sobrouemcasa.model.Ong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OngRepository extends JpaRepository<Ong, Long> {
}
