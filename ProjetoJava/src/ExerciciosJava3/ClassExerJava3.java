package ExerciciosJava3;
import java.util.Scanner;
public class ClassExerJava3 {

	/*3) Desenvolva um sistema em que:
		Leia 4 (quatro) n�meros;
		Calcule o quadrado de cada um;
		Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		Caso contr�rio, imprima os valores lidos e seus respectivos quadrados.*/
		
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		int num1, num2, num3, num4;
		double q1, q2, q3, q4;
		System.out.println("Digite o primeiro n�mero: ");
		num1 = ler.nextInt();
       
		System.out.println("Digite o Segundo n�mero: ");
		num2 = ler.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		num3 = ler.nextInt();

		System.out.println("Digite o quarto n�mero: ");
		num4 = ler.nextInt();
		
		q1 = Math.pow(num1, 2);
		q2 = Math.pow(num2, 2);
		q3 = Math.pow(num3, 2);
		q4 = Math.pow(num4, 2);
		
		if (q3 >= 1000) {
			System.out.println("O quadrado de "+ num3 + " � de: "+ q3);
		}
		else {
			System.out.println("O quadrado de "+ num1 + " � de: "+ q1);
			System.out.println("O quadrado de "+ num2 + " � de: "+ q2);
			System.out.println("O quadrado de "+ num3 + " � de: "+ q3);
			System.out.println("O quadrado de "+ num4 + " � de: "+ q4);
			
		}


	}

}
