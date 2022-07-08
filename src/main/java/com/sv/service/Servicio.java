package com.sv.service;
import java.util.List;
import java.util.Optional;

import com.sv.Modelos.User;

public interface Servicio {
	
	List<User> buscarUsuarioAll();
	Optional<User> buscarUsuario(int x);
	User InsertarUsuario( User us);
	User updateUsuario( User us);
	void eliminarUsuario(int x);
	
}
