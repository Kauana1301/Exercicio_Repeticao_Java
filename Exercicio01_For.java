package br.com.generation.lacosrepeticao;

public class Exercicio01_For {

	public static void main(String[] args) {
		
		int numeros = 0;
				
		for(numeros = 1000; numeros <= 1999; numeros++) {
			if(numeros % 11 == 5) {
				
				System.out.println(" " + numeros);
			}
		}

	}

}
