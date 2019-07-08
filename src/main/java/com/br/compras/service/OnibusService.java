package com.br.compras.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.br.compras.models.ClienteModel;
import com.br.compras.models.OnibusModel;

@Service
public class OnibusService {

	private List<OnibusModel> listaOnibus = new ArrayList<OnibusModel>();

	public List<OnibusModel> exibirTodos() {
		List<ClienteModel> lista1 = new ArrayList<ClienteModel>();
		List<ClienteModel> lista2 = new ArrayList<ClienteModel>();
		lista1.add(new ClienteModel("jefferson", "gugugu", 23, 1));
		lista2.add(new ClienteModel("bruno", "gugugu", 23, 1));
		
		listaOnibus.add(new OnibusModel(1, "BrunoBus", "sei la", "Uma hora e meia", 20, 20, lista1));
		listaOnibus.add(new OnibusModel(2, "BenBus", "Onde eu quizer", "Uma hora ", 20, 20, lista2));

		return listaOnibus;

	}

	public void cadastrarCliente(int id, ClienteModel cliente) {
		
		List<ClienteModel> lista = new ArrayList<ClienteModel>();
		
		OnibusModel onibus = new OnibusModel();
		
		for (OnibusModel onibusModel : listaOnibus) {

			if (onibusModel.getId() == id) {
				onibus = onibusModel;

			}
		}
		
		
		lista = onibus.getListaClientes();		
		lista.add(cliente);		
		onibus.setListaClientes(lista);

	}

}
