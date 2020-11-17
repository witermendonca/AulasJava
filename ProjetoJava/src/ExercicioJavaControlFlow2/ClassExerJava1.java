package ExercicioJavaControlFlow2;

import java.util.Scanner;
public class ClassExerJava1 {

	/*Escreva um programa para ler 2 valores (considere que não serão informados valores iguais) 
	 *e escrever o maior deles.*/
	
	public static void main(String[] args) {
		
		int v1, v2;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		v1 = ler.nextInt();
		
		System.out.println("Digite o segundo número: ");
		v2 = ler.nextInt();
		
		if (v1 > v2 ) {
			System.out.println("O primeiro valor que foi digitado é o maoir.\nO valor digitado foi: "+ v1);
		}
		else {
			System.out.println("O segundo valor que foi digitado é o maoir.\nO valor digitado foi: "+ v2);
		}
		
	}

}
