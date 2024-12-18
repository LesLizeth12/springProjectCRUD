package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Usuario;

public interface UsuarioService {
	public abstract List<Usuario> listaAllUsers();
	public abstract Usuario addUser(Usuario usuario);
	
	
}
