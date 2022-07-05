package com.sv.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sv.Modelos.User;
import com.sv.repositorio.InterfaceUsuario;


@RestController
@RequestMapping("/User")
public class UserControlador {
	
	@Autowired
	private InterfaceUsuario interfaceUser;
	
	@GetMapping
	public List<User> usuarios() {
		return (List<User>) interfaceUser.findAll();
	}
	@PostMapping //Guardar el usuario con metodo post mapping
	public void insertar( @RequestBody User us ) {
		interfaceUser.save(us);	
	}
	@PutMapping //Act datos
	public void Updatear( @RequestBody User us ) {
		interfaceUser.save(us);	
	}
	@DeleteMapping( value= "/{id}" ) //Eliminar datos
	public void Eliminar(@PathVariable("id") Integer id) {
		interfaceUser.deleteById(id);
	}
	
}

