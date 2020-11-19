package ExercíciosComVetoresMatrizes;

import java.util.Scanner;
public class ClassExerJavaVetoresMatrizes1 {

	/*1.Um dado é lançado 10 vezes e o valor correspondente é anotado. 
	 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
	 * A seguir determine e imprima a média aritmética dos lançamentos, 
	 * contabilize e apresente também quantas foram as ocorrências da maior pontuação.*/
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int [] lan = new int [10];
		int i , ocorrencias = 0 , maior = 0 , soma = 0;
		double media; 
		for(i = 0 ; i < 10 ; i ++) {
			
			System.out.println("Entre com o "+ (i+1) +"° valor do dado: ");
			lan [i] = ler.nextInt();
			
			soma = soma + lan[i];

			if (lan[i] > maior) {
				
				maior = lan [i];
				
				}
			
		}
		
		media = (double) soma / 10;
		
		for(i = 0; i < 10; i++) {
			
			if( maior == lan[i]) {
				ocorrencias++;
				}
		System.out.println("O " + (i+1) + "° lançamento foi o valor de: " + lan[i]);
		}
		
		System.out.println("A média aritmética dos lançamentos é de: " + media);
		
		System.out.println("A maior pontuação foi de: " + maior + " e teve o total de: " + ocorrencias + " ocorrencias.");
		
	}

}
