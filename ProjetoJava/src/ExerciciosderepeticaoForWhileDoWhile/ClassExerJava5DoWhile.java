package ExerciciosderepeticaoForWhileDoWhile;

import java.util.Scanner;
public class ClassExerJava5DoWhile {

	/*Escrever um programa que receba v�rios n�meros inteiros no teclado. 
	 *E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
	 *Para sair digitar 0(zero).(DO...WHILE)*/
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num , cont = 0, soma = 0;
		
		do {
			System.out.println("Digite um n�mero inteiro ou digite 0 para sair do programa: ");
			num = ler.nextInt();
			
			if (num % 3 == 0 & num > 0) {
				 soma = num + soma;
				 cont++;
			}
				
		}while(num != 0);
		
		System.out.println("A m�dia dos n�meros m�ltiplos de 3 � de: " + ((double)soma / cont));

	}
 
}
