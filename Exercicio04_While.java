package br.com.generation.lacosrepeticao;

import java.util.Scanner;

public class Exercicio04_While {

	public static void main(String[] args) {
		
		int cont_tentativas = 0, cont_pessoaCalma = 0, cont_mulherNervosa = 0, cont_homemAgressivo = 0, cont_outroCalmo = 0,
				cont_nervoso40 = 0, cont_calmo18 = 0;
		int idade = 0, sexo = 0, perso = 0;
		
		Scanner leia = new Scanner(System.in);
		
		while(cont_tentativas < 3) {
			System.out.println("Informe sua idade: ");
			idade = leia.nextInt(); 
			System.out.println("Informe a personalidade em número 1- Calmo| 2- Nervoso| 3- Agressivo: ");
			perso = leia.nextInt(); 
			System.out.println("Informe o sexo em número 1- Feminino| 2- Masculino| 3- Outros: ");
			sexo = leia.nextInt(); 
			
			if(perso == 1) {
				cont_pessoaCalma++;
			}
			if(sexo == 1 && perso == 2) {
				cont_mulherNervosa++;
			}
			if(sexo == 2 && perso == 3) {
				cont_homemAgressivo++;
			}
			if(sexo == 3 && perso == 1) {
				cont_outroCalmo++;
			}
			if(idade > 40 && perso == 1) {
				cont_nervoso40++;
			}
			if(idade < 18 && perso == 1) {
				cont_calmo18++;
			}
					
			cont_tentativas++;
		}
		System.out.println("\nnumero de pessoas calmas: "+cont_pessoaCalma);
		System.out.println("\nnumero de mulheres nervosas: "+cont_mulherNervosa);
		System.out.println("\nnumero de homens agressivos: "+cont_homemAgressivo);
		System.out.println("\nnumero de outros calmos: "+cont_outroCalmo);
		System.out.println("\nnumero de mais de 40 anos nervosos: "+cont_nervoso40);
		System.out.println("\nnumero de calmos menores que 18 anos: "+cont_calmo18);
		
		leia.close();
	}

}
