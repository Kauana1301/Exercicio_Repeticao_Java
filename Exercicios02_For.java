package br.com.generation.lacosrepeticao;

//import java.util.Scanner;

public class Exercicios02_For {

	public static void main(String[] args) {
		
					
		int numeros = 0, numerosPares = 0, numerosImpares = 0; 
		
		for(numeros = 0; numeros <= 10; numeros++ ) {
			if(numeros % 2 == 0) {
				numerosPares++;					
			}
			else {
				numerosImpares++; 
			}
		}
		System.out.println("Par: " + numerosPares);
		System.out.println("Impar: " + numerosImpares);
	}

}
