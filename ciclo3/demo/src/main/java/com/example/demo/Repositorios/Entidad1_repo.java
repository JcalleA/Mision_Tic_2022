package com.example.demo.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Entidad1;
@Repository
public interface Entidad1_repo extends JpaRepository<Entidad1,Integer> {
    
}
