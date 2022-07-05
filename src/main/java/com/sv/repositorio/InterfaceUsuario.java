package com.sv.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sv.Modelos.User;

@Repository
public interface InterfaceUsuario extends CrudRepository<User, Integer>{

}
