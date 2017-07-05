package br.com.smtsystems.exercicio4;

import br.com.smtsystems.exercicio4.model.Fibonacci;

public class Exercicio4 {

	public static void main(String[] args) {
		// A classe Exercicio4 não deverá ser alterada.
		// Alterar apenas o método fibonnacci
		// Sequência Fibonnacci -> https://pt.wikipedia.org/wiki/Leonardo_Fibonacci (A Sequência de Fibonacci)
        for (int i = 0; i < 15; i++) {
            System.out.print("(" + i + "):" + Fibonacci.fibonacci(i) + "\t");
        }
	}
}
