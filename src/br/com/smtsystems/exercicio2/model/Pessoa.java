package br.com.smtsystems.exercicio2.model;

public class Pessoa {

	private double altura;
	
	private String nome;
	
	public Pessoa(double altura, String nome) {
		this.altura = altura;
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [altura=" + altura + ", nome=" + nome + "]";
	}
	
	
	
}
