package br.com.smtsystems.exercicio1.model;

public class Posicao {

	private int linha;
	
	private int coluna;

	public Posicao(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + linha;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicao other = (Posicao) obj;
		if (linha != other.linha)
			return false;
		return true;
	}
	
	
}
