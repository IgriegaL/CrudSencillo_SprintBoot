package com.sv.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sv.Modelos.User;
import com.sv.service.Servicio;


@RestController
@RequestMapping("/User")
public class UserControlador {
	
	@Autowired
	@Qualifier("ServicioUser")
	private Servicio servicio;
	
	@GetMapping
	public List<User> usuarios() {
		//return (List<User>) interfaceUser.findAll();
		return servicio.buscarUsuarioAll();
	}
	@GetMapping( value= "/{id}" )
	public Optional<User> usuarios1(@PathVariable("id") Integer id) {
		//return (List<User>) interfaceUser.findAll();
		return servicio.buscarUsuario(id);
	}
	@DeleteMapping( value= "/{id}" )
	public void eliminarusuarios(@PathVariable("id") Integer id) {
		//return (List<User>) interfaceUser.findAll();
		servicio.eliminarUsuario(id);
	}
	@PutMapping( value= "/{id}" )
	public void updateUsuarios(@RequestBody User us)  {
		//return (List<User>) interfaceUser.findAll();
		servicio.updateUsuario(us);
	}
	@PostMapping( value= "/{id}" )
	public void InsertUsuarios(@RequestBody User us)  {
		servicio.InsertarUsuario(us);
	}
	
	
	
	/*@PostMapping //Guardar el usuario con metodo post mapping
	public void insertar( @RequestBody User us ) {
		//interfaceUser.save(us);	
	}
	
	
	@PutMapping //Act datos
	public void Updatear( @RequestBody User us ) {
		//interfaceUser.save(us);	
	}
	@DeleteMapping( value= "/{id}" ) //Eliminar datos
	public void Eliminar(@PathVariable("id") Integer id) {
		//interfaceUser.deleteById(id);
	}*/
	
}

