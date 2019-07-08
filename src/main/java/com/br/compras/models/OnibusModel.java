package com.br.compras.models;

import java.util.List;

public class OnibusModel {
	
	private int id;
	private String empresa;
	private String destino;
	private String tempoViagem;
	private int lugares;
	private int lugaresDisponiveis;
	private List<ClienteModel> listaClietes;
	
	

	public OnibusModel() {
		
	}
	
	

	public OnibusModel(int id,String empresa, String destino, String tempoViagem, int lugares, int lugaresDisponiveis,
			List<ClienteModel> listaClietes) {
		this.id = id;
		this.empresa = empresa;
		this.destino = destino;
		this.tempoViagem = tempoViagem;
		this.lugares = lugares;
		this.lugaresDisponiveis = lugaresDisponiveis;
		this.listaClietes = listaClietes;
	}

	


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getTempoViagem() {
		return tempoViagem;
	}

	public void setTempoViagem(String tempoViagem) {
		this.tempoViagem = tempoViagem;
	}

	public int getLugares() {
		return lugares;
	}

	public void setLugares(int lugares) {
		this.lugares = lugares;
	}

	public int getLugaresDisponiveis() {
		return lugaresDisponiveis;
	}

	public void setLugaresDisponiveis(int lugaresDisponiveis) {
		this.lugaresDisponiveis = lugaresDisponiveis;
	}

	public List<ClienteModel> getListaClietes() {
		return listaClietes;
	}

	public void setListaClietes(List<ClienteModel> listaClietes) {
		this.listaClietes = listaClietes;
	}
	
}
