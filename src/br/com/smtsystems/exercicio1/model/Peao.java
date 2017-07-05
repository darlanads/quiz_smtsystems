package br.com.smtsystems.exercicio1.model;

public class Peao implements Peca {

	private int cor;
	
	private Posicao posicao;

	public Peao(int cor, Posicao posicao) {
		this.cor = cor;
		this.posicao = posicao;
	}

	public int getCor() {
		return cor;
	}

	public void setCor(int cor) {
		this.cor = cor;
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cor;
		result = prime * result + ((posicao == null) ? 0 : posicao.hashCode());
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
		Peao other = (Peao) obj;
		if (posicao == null) {
			if (other.posicao != null)
				return false;
		} else if (!posicao.equals(other.posicao))
			return false;
		if (cor != other.cor)
			return false;
		return true;
	}
	
	
}
