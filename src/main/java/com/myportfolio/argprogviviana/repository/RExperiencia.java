package com.myportfolio.argprogviviana.repository;

import com.myportfolio.argprogviviana.entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Integer> {
}
