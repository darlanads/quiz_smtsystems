package br.com.smtsystems.exercicio3;

import java.util.Calendar;
import java.util.Date;

public class Exercicio3 {

	public static void main(String[] args) {
		// Dado duas data
		Calendar c = Calendar.getInstance();
		c.set(2015, 0, 1);
		Date date1 = c.getTime();
		
		c.set(2017, 10, 1);
		Date date2 = c.getTime();

		System.out.println(date1);
		System.out.println(date2);
		int qtdDomingos = 0;
		// TODO Adicionar o código aqui em abaixo. 
		// Calcular a quantidade de domingo que existe entre as duas datas.
		
		
		System.out.println(qtdDomingos);
	}

}
