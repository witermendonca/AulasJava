package ExercicioJavaControlFlow2;

import java.util.Scanner;
public class ClassExerJava6 {
 
	/*6.Escreva um programa para ler 3 valores inteiros e escrever o maior deles. 
	 * Considere que o usuário não informará valores iguais.
	 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int v1, v2, v3;
		
		System.out.println("DIgite valo 1: ");
		v1 = ler.nextInt();
		
		System.out.println("DIgite valo 2: ");
		v2 = ler.nextInt();

		System.out.println("DIgite valo 3: ");
		v3 = ler.nextInt();
		
		if(v1 > v2 && v1 > v3) {
			System.out.println("O valor 1 é o maoir valor digitado.");
		}
		else if (v2 > v1 && v2 > v3) {
			System.out.println("O valor 2 é o maoir valor digitado.");
		}
		else {
			System.out.println("O valor 3 é o maoir valor digitado.");
		}


	}

}
