package com.myportfolio.argprogviviana.repository;

import com.myportfolio.argprogviviana.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPersona extends JpaRepository<Persona, Integer> {
    Persona findByEmailAndPassword(String email, String password);
}
