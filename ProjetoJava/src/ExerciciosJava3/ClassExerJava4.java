package ExerciciosJava3;
import java.util.Scanner;
public class ClassExerJava4 {
 
	/*4) Faça um sistema que leia um número inteiro 
	 * e mostre uma mensagem indicando se este número é par ou ímpar, 
	 * e se é positivo ou negativo.*/
	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int num;
		System.out.println("Digite um número: ");
		num = ler.nextInt();
		
		if(num % 2 == 0) {
			if(num >= 0) {
				System.out.println("O número " + num + " é par e positivo.");
			}
			else {
				System.out.println("O número " + num + " é par e negativo");
			}
		}
		else {
			if(num >= 0) {
				System.out.println("O número " + num + " é impar e positivo.");
			}
			else {
				System.out.println("O número " + num + " é impar e negativo");
			}
		}

	}

}
