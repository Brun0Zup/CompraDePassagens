package com.br.compras.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.compras.service.OnibusService;

@Controller
public class OnibusController {
	
	@Autowired
	private OnibusService onibusService;
	
	@GetMapping("/")
	public ModelAndView listarOnibus() {
		ModelAndView modelAndView = new ModelAndView("onibus.html");
		modelAndView.addObject("listaOnibus", onibusService.exibirTodos());
		return modelAndView;
		
		
	}

}
