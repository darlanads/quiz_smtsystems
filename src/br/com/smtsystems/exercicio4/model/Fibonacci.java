package br.com.smtsystems.exercicio4.model;

public class Fibonacci {

	public static int fibonacci(int n) {
        return (n < 2) ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }
}
