package br.com.generation.lacosrepeticao;

import java.util.Scanner;

public class Exercicio03_While {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idadePessoas = 0, primeiroGrupo = 0, segundoGrupo = 0; 
		
		//System.out.println("Informe a idade: ");
		//idadePessoas = leia.nextInt();
		
		while(idadePessoas < 99) {
			System.out.println("Informe a idade: ");
			idadePessoas = leia.nextInt();
			
			if(idadePessoas <= 21) {
				primeiroGrupo++;
				System.out.println("Total de pessoas com menos de 21 anos é de: " + primeiroGrupo);
			}
			//else(idadePessoas <= 50) {
			if(idadePessoas > 50) {
				segundoGrupo++;
				System.out.println("Total de pessoas com mais de 50 anos é de: " + segundoGrupo);
			}
	}
		leia.close();
		
	}
}
