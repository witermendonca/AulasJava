package ExerciciosJava3;

import java.util.Scanner;
public class ClassExerJava8 {
	/*8) Construa um sistema para ler uma vari�vel num�rica N 
	 * e imprimi-la somente se a mesma for maior que 100, 
	 * caso contr�rio imprimi-la com o valor zero.
	 */

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n ;
		System.out.println("Informe a vari�vel N: ");
		n = ler.nextInt();
		
		if (n > 100) {
			System.out.println("A vari�vel N tem o valor de: " + n);
		}
		else {
			n = 0;
			System.out.println("A vari�vel N tem o valor de: " + n);
		}

	}

}
