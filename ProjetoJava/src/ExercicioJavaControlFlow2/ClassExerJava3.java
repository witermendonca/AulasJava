package ExercicioJavaControlFlow2;

import java.util.Scanner;
public class ClassExerJava3 {

	/*As ma��s custam R$ 0,30 cada se forem compradas menos do que uma d�zia, 
	 * e R$ 0,25 se forem compradas pelo menos doze. 
	 * Escreva um programa que leia o n�mero de ma��s compradas, 
	 * calcule e escreva o valor total da compra.
	 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double total;
		System.out.println("Informe a quantidade de ma��s compradas: ");
		int qtd = ler.nextInt();
		
		if (qtd < 12) {
			
			total = qtd * 0.30;
			System.out.println("A quantidade de m��as compradas � de " + qtd +"\nValor total da compra: " + total );
		}
		else {
			total = qtd * 0.25;
			System.out.println("A quantidade de m��as compradas � de " + qtd +"\nValor total da compra: " + total );
		}
	
	
		

	}

}
