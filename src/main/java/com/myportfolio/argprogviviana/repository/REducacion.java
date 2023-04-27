package com.myportfolio.argprogviviana.repository;

import com.myportfolio.argprogviviana.entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository<Educacion, Integer> {
}
