package ExercicioJavaControlFlow2;

import java.util.Scanner;
public class ClassExerJava1 {

	/*Escreva um programa para ler 2 valores (considere que n�o ser�o informados valores iguais) 
	 *e escrever o maior deles.*/
	
	public static void main(String[] args) {
		
		int v1, v2;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		v1 = ler.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		v2 = ler.nextInt();
		
		if (v1 > v2 ) {
			System.out.println("O primeiro valor que foi digitado � o maoir.\nO valor digitado foi: "+ v1);
		}
		else {
			System.out.println("O segundo valor que foi digitado � o maoir.\nO valor digitado foi: "+ v2);
		}
		
	}

}
