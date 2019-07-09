package com.br.compras.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.br.compras.models.ClienteModel;
import com.br.compras.models.OnibusModel;

@Service
public class OnibusService {

	List<ClienteModel> lista1 = new ArrayList<ClienteModel>();
	List<ClienteModel> lista2 = new ArrayList<ClienteModel>();

	private List<OnibusModel> listaOnibus = new ArrayList<OnibusModel>(
			Arrays.asList(new OnibusModel(1, "BrunoBus", "sei la", "Uma hora e meia", 2, 2, lista1),
					new OnibusModel(2, "BenBus", "Onde eu quiser", "Uma hora ", 20, 20, lista2)));

	public List<OnibusModel> exibirTodos() {
		return listaOnibus;

	}

	public String cadastrarCliente(int id, ClienteModel cliente) {

		List<ClienteModel> lista = new ArrayList<ClienteModel>();

		for (OnibusModel onibusModel : listaOnibus) {

			if (onibusModel.getId() == id) {
				if (onibusModel.getLugaresDisponiveis() < 1) {
					return "redirect:/esgotado";
				} else if (cliente.getIdade() < 18) {
					return "redirect:/barrado";
				} else {
					onibusModel.setLugaresDisponiveis(onibusModel.getLugaresDisponiveis() - 1);
					lista = onibusModel.getListaClientes();
					lista.add(cliente);
					onibusModel.setListaClientes(lista);

					return "redirect:/comprar/{id}";

				}

			}
		}
		return "redirect:/comprar/{id}";

	}

}
