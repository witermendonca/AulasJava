package ExerciciosderepeticaoForWhileDoWhile;

import java.util.Scanner;
public class ClassExerJava8While {

	/*Elaborar um programa que efetue a leitura sucessiva de valores num�ricos 
	 *e apresente no final o total do somat�rio, a m�dia e o total de valores lidos. 
	 *O programa deve fazer as leituras dos valores enquanto o usu�rio estiver fornecendo valores positivos. 
	 *Ou seja, o programa deve parar quando o usu�rio fornecer um valor negativo. (WHILE)
	 */
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num = 0, soma = 0 , total =0;
		
		while(num >= 0) {
		
				System.out.println("Digite um n�mero: ");
			    num = ler.nextInt();
			if (num >= 0) {
			soma = soma + num;
			
			total++;
			}
			
		}
		
		System.out.println("A somat�ria dos valores lidos � de: " + soma);
		System.out.println("A m�dia dos valores  lidos � de: " +  ((double)soma / total) );
		System.out.println("O total de valores lidos doi de: " + total);

	}

}
