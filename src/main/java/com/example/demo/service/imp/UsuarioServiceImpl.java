package com.example.demo.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;
import com.example.demo.service.UsuarioService;

@Service("usuarioservice")
public class UsuarioServiceImpl implements UsuarioService{
	@Autowired
	@Qualifier("usuariorepository")
	private UsuarioRepository usuariorepository;

	@Override
	public List<Usuario> listaAllUsers() {
		return usuariorepository.findAll();
	}

	@Override
	public Usuario addUser(Usuario usuario) {
		return usuariorepository.save(usuario);
	}


	
	
	
}
