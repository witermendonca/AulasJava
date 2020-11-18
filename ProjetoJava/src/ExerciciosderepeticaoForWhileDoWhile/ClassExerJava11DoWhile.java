package ExerciciosderepeticaoForWhileDoWhile;

import java.util.Scanner;
public class ClassExerJava11DoWhile {

	/*Faça um programa que pegue um número do teclado e calcule 
	 a soma de todos os números  de 1 até ele. Ex.: o usuário entra 7, 
	 o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28. .(DO...WHILE)
	 */
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num, cont, soma = 0;
		System.out.println("Digite um número do seu teclado: ");
		num = ler.nextInt();
		cont = num;
		do {
			soma = soma + cont;
			cont--;
			
		}while(cont > 0);
		
		System.out.println("A soma de todos os números  de 1 até " + num + " é de " + soma);

	}

}
