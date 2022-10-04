package com.example.demo.Repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Entidad1;

@Repository
public interface Entidad1_repo2 extends CrudRepository<Entidad1,Integer> {
    
}
