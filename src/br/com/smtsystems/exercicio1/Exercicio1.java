package br.com.smtsystems.exercicio1;

import java.util.HashSet;
import java.util.Set;

import br.com.smtsystems.exercicio1.model.Peao;
import br.com.smtsystems.exercicio1.model.Peca;
import br.com.smtsystems.exercicio1.model.Posicao;

public class Exercicio1 {

	public static void main(String[] args) {

		Peca peaoPreto1 = new Peao(Peca.PRETA, new Posicao(1, 2));
		Peca peaoPreto2 = new Peao(Peca.PRETA, new Posicao(1, 3));
		
		Set<Peca> tabuleiro = new HashSet<Peca>();
		tabuleiro.add(peaoPreto1);
		tabuleiro.add(peaoPreto2);

		// A quantidade deveria mostrar 2. Qual o problema está acontecendo.
		// A classe Excercio1 e o método main não deverão ser alterados.
		System.out.println(tabuleiro.size());

	}

}
