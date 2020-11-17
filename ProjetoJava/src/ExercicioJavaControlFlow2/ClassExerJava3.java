package ExercicioJavaControlFlow2;

import java.util.Scanner;
public class ClassExerJava3 {

	/*As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, 
	 * e R$ 0,25 se forem compradas pelo menos doze. 
	 * Escreva um programa que leia o número de maçãs compradas, 
	 * calcule e escreva o valor total da compra.
	 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double total;
		System.out.println("Informe a quantidade de maçãs compradas: ");
		int qtd = ler.nextInt();
		
		if (qtd < 12) {
			
			total = qtd * 0.30;
			System.out.println("A quantidade de mãças compradas é de " + qtd +"\nValor total da compra: " + total );
		}
		else {
			total = qtd * 0.25;
			System.out.println("A quantidade de mãças compradas é de " + qtd +"\nValor total da compra: " + total );
		}
	
	
		

	}

}
