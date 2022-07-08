package com.sv.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sv.Modelos.User;
import com.sv.repositorio.InterfaceUsuario;

@Service("ServicioUser")
public class ServicioUserImpl implements Servicio{
	@Autowired
	private InterfaceUsuario interfaceUser;
	@Override
	public List<User> buscarUsuarioAll() {
		// return (List<User>) interfaceUser.findAll()
		return (List<User>) interfaceUser.findAll();
	}
	@Override
	public Optional<User> buscarUsuario(int x) {
		// TODO Auto-generated method stub
		return interfaceUser.findById(x);
	}
	@Override
	public void eliminarUsuario(int x) {
		// TODO Auto-generated method stub
		interfaceUser.deleteById(x);
	}
	@Override
	public User updateUsuario( User us) {
		// TODO Auto-generated method stub
		return interfaceUser.save(us);
	}
	@Override
	public User InsertarUsuario(User us) {
		// TODO Auto-generated method stub
		return interfaceUser.save(us);
	}
	
}
