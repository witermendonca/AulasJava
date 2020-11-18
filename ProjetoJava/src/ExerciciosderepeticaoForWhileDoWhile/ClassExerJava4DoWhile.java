package ExerciciosderepeticaoForWhileDoWhile;
import java.util.*;
public class ClassExerJava4DoWhile {

	/*Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
	 *No final, mostre a soma dos números digitados.(DO...WHILE)*/
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, cont , soma = 0;
		
		do {
			System.out.println("Digite um número do seu teclado ou para sair digite 0: ");
			num = ler.nextInt();
			if (num < 0 || num > 9) {
				System.out.println("Número inválido. Digite novamente.");
			}
			else {
			soma = soma + num;
			}
		}while (num > 0);
		
		System.out.println("A soma dos números digitados é: " + soma);

	}
}
