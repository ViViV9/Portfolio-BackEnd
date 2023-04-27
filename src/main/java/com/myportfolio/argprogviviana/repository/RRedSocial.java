package com.myportfolio.argprogviviana.repository;

import com.myportfolio.argprogviviana.entity.RedSocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RRedSocial extends JpaRepository<RedSocial, Integer> {
}
