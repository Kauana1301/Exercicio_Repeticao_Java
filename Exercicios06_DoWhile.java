package br.com.generation.lacosrepeticao;

import java.util.Scanner;

public class Exercicios06_DoWhile {

	public static void main(String[] args) {
		
		int numeroDigitado = 0, media = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um n�mero: ");
			numeroDigitado = leia.nextInt();
		
			if(numeroDigitado % 3 == 0) {
				media++;
			}
			
		}
		while(numeroDigitado != 0);
		System.out.println("A M�dia de n�mero �: " + media);
	
		leia.close();
	}
	
	
}
