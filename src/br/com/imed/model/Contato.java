package br.com.imed.model;

public class Contato {
	
	private String nome;
	private String sobrenome;
	private String sexo;
	
	public Contato(String nome, String sobrenome, String sexo) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
	}
	
	public Contato() {
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
