package ExerciciosderepeticaoForWhileDoWhile;

import java.util.Scanner;
public class ClassExerJava5DoWhile {

	/*Escrever um programa que receba vários números inteiros no teclado. 
	 *E no final imprimir a média dos números múltiplos de 3. 
	 *Para sair digitar 0(zero).(DO...WHILE)*/
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num , cont = 0, soma = 0;
		
		do {
			System.out.println("Digite um número inteiro ou digite 0 para sair do programa: ");
			num = ler.nextInt();
			
			if (num % 3 == 0 & num > 0) {
				 soma = num + soma;
				 cont++;
			}
				
		}while(num != 0);
		
		System.out.println("A média dos números múltiplos de 3 é de: " + ((double)soma / cont));

	}
 
}
