package br.com.generation.lacosrepeticao;

import java.util.Scanner;

public class Exercicio05_DoWhile {

	public static void main(String[] args) {
		
		int numeroDigitado = 0, soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		
		do {
			System.out.println("Digite um número: ");
			numeroDigitado = leia.nextInt();
			soma += numeroDigitado;
		}
		while(numeroDigitado != 0);
		System.out.println("Soma dos números digitados: " + soma);
		leia.close();
	}

}
