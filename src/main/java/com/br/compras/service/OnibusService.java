package com.br.compras.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.br.compras.models.ClienteModel;
import com.br.compras.models.OnibusModel;

@Service
public class OnibusService {

	private List<OnibusModel> listaOnibus = new ArrayList<OnibusModel>();

	public void criarOnibus() {
		List<ClienteModel> lista1 = new ArrayList<ClienteModel>();
		List<ClienteModel> lista2 = new ArrayList<ClienteModel>();
		
		listaOnibus.add(new OnibusModel(1, "BrunoBus", "sei la", "Uma hora e meia", 20, 20, lista1));
		listaOnibus.add(new OnibusModel(2, "BenBus", "Onde eu quizer", "Uma hora ", 20, 20, lista2));

	}

	public List<OnibusModel> exibirTodos() {
		return listaOnibus;

	}


	public void cadastrarCliente(int id, ClienteModel cliente) {

		List<ClienteModel> lista = new ArrayList<ClienteModel>();

		OnibusModel onibus = new OnibusModel();

		for (OnibusModel onibusModel : listaOnibus) {

			if (onibusModel.getId() == id) {
				onibus = onibusModel;
				
				onibus.setLugaresDisponiveis(onibus.getLugaresDisponiveis()-1);
				lista = onibus.getListaClientes();
				lista.add(cliente);
				onibus.setListaClientes(lista);
				

			}
		}
		
//		listaOnibus.remove(onibus);
//
//		lista = onibus.getListaClientes();
//		lista.add(cliente);
//		onibus.setListaClientes(lista);
//		
//		listaOnibus.add(onibus);

	}

}
