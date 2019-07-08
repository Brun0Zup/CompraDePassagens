package com.br.compras.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.br.compras.models.OnibusModel;

@Service
public class OnibusService {

	private List<OnibusModel> listaOnibus = new ArrayList<OnibusModel>();

	public List<OnibusModel> exibirTodos() {
		listaOnibus.add(new OnibusModel(1,"BrunoBus", "sei la", "Uma hora e meia", 20, 20, null));
		listaOnibus.add(new OnibusModel(2,"BenBus", "Onde eu quizer", "Uma hora ", 20, 20, null));
		
		return listaOnibus;

	}

}
