package br.com.smtsystems.exercicio2;

import java.util.Arrays;
import java.util.List;

import br.com.smtsystems.exercicio2.model.Pessoa;

public class Exercicio2 {

	public static void main(String[] args) {

		List<Pessoa> pessoas = Arrays.asList(
				new Pessoa(1.72d, "Darlan"), 
				new Pessoa(2d, "Antiono Jose"),
				new Pessoa(1.65d, "Marian Jose"),
				new Pessoa(2d, "Antonio Augusto"),
				new Pessoa(1.63d, "Marian Antonia")
				);

		// Ordenar a lista por ALTURA e NOME.
		// Adicionar o código de ordenação logo abaixo. Sugestão, utilizar
		// o método sort da API java.
		// TODO Adcionar o código logo abaixo. IMPORTANTE, ordenar por ALTURA E NOME crescentemente.
		

		System.out.println(pessoas);

	}

}
