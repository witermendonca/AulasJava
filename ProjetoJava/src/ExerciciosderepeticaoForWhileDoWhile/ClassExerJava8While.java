package ExerciciosderepeticaoForWhileDoWhile;

import java.util.Scanner;
public class ClassExerJava8While {

	/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos 
	 *e apresente no final o total do somatório, a média e o total de valores lidos. 
	 *O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. 
	 *Ou seja, o programa deve parar quando o usuário fornecer um valor negativo. (WHILE)
	 */
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num = 0, soma = 0 , total =0;
		
		while(num >= 0) {
		
				System.out.println("Digite um número: ");
			    num = ler.nextInt();
			if (num >= 0) {
			soma = soma + num;
			
			total++;
			}
			
		}
		
		System.out.println("A somatória dos valores lidos é de: " + soma);
		System.out.println("A média dos valores  lidos é de: " +  ((double)soma / total) );
		System.out.println("O total de valores lidos doi de: " + total);

	}

}
