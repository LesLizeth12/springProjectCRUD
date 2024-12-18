package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Usuario;
import com.example.demo.service.UsuarioService;

@Controller
@RequestMapping("/user")
public class UsuarioController {
	@Autowired
	@Qualifier("usuarioservice")
	private UsuarioService usuarioservice;
	
	@GetMapping("/list")
	public ModelAndView listAllUsuarios() {
		ModelAndView mav=new ModelAndView("list");
		mav.addObject("usuarios", usuarioservice.listaAllUsers());
		mav.addObject("user", new Usuario());
		return mav;
	}
	
	@PostMapping("/addusers")
	public String addUsers(@ModelAttribute(name="users") Usuario usuario) {
		usuarioservice.addUser(usuario);
		return "redirect:/user/list";
	}
	
	
}
