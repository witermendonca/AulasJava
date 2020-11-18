package ExerciciosderepeticaoForWhileDoWhile;

import java.util.Scanner;
public class ClassExerJava9While {
	
	/*Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  
	 *(imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário digita 5,  
	 *deveremos observar na tela a seguinte sequência: 5 15 45 135.
     (WHILE)
	 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int x = ler.nextInt();
		while(x <= 100) {
			
			x = x * 3;
			System.out.println(x);

		}
		
	

	}

}
