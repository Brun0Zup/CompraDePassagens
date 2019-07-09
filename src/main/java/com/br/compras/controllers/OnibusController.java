package com.br.compras.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.compras.models.ClienteModel;
import com.br.compras.service.ClienteService;
import com.br.compras.service.OnibusService;

@Controller
public class OnibusController {

	@Autowired
	private OnibusService onibusService;

	@GetMapping("/")
	public ModelAndView listarOnibus() {
		ModelAndView modelAndView = new ModelAndView("onibus.html");
		onibusService.criarOnibus();
		modelAndView.addObject("listaOnibus", onibusService.exibirTodos());
		return modelAndView;

	}

	@GetMapping("/comprar/{id}")
	public ModelAndView compraPassagens() {
		ModelAndView modelAndView = new ModelAndView("entradaDeCliente.html");
		return modelAndView;
	}

	@PostMapping("/comprar/{id}")
	public String cliente(ClienteModel cliente, @PathVariable int id) {

		ClienteService clienteCadastrado = new ClienteService();
		clienteCadastrado.cadastrarCliente(cliente);
		onibusService.cadastrarCliente(id, cliente);

		return "redirect:/comprar/{id}";

	}

}
