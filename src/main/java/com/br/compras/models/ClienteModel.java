package com.br.compras.models;

public class ClienteModel {
	
	private String nome;
	private String email;
	private int idade;
	private int quantidadeDeMalas;
	
	
	public ClienteModel() {
	}
	
	
	public ClienteModel(String nome, String email, int idade, int quantidadeDeMalas) {

		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.quantidadeDeMalas = quantidadeDeMalas;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getQuantidadeDeMalas() {
		return quantidadeDeMalas;
	}
	public void setQuantidadeDeMalas(int quantidadeDeMalas) {
		this.quantidadeDeMalas = quantidadeDeMalas;
	}
	
	public String toString() {
		StringBuilder modelo = new StringBuilder();
		modelo.append("Nome: "+this.getNome());
		modelo.append("Email: "+this.getEmail());
		modelo.append("Idade: "+this.getIdade());
		modelo.append("Quatidade de malas: "+this.getQuantidadeDeMalas());
		return modelo.toString();
	}
	

}
