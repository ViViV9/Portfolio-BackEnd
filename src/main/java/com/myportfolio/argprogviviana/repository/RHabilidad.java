package com.myportfolio.argprogviviana.repository;

import com.myportfolio.argprogviviana.entity.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHabilidad extends JpaRepository<Habilidad, Integer>{
}
