package Exerc�ciosComVetoresMatrizes;

import java.util.Scanner;
public class ClassExerJavaVetoresMatrizes1 {

	/*1.Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
	 * Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
	 * A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, 
	 * contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.*/
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int [] lan = new int [10];
		int i , ocorrencias = 0 , maior = 0 , soma = 0;
		double media; 
		for(i = 0 ; i < 10 ; i ++) {
			
			System.out.println("Entre com o "+ (i+1) +"� valor do dado: ");
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
		System.out.println("O " + (i+1) + "� lan�amento foi o valor de: " + lan[i]);
		}
		
		System.out.println("A m�dia aritm�tica dos lan�amentos � de: " + media);
		
		System.out.println("A maior pontua��o foi de: " + maior + " e teve o total de: " + ocorrencias + " ocorrencias.");
		
	}

}
