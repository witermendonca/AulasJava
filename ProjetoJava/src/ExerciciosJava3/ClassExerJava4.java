package ExerciciosJava3;
import java.util.Scanner;
public class ClassExerJava4 {
 
	/*4) Fa�a um sistema que leia um n�mero inteiro 
	 * e mostre uma mensagem indicando se este n�mero � par ou �mpar, 
	 * e se � positivo ou negativo.*/
	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int num;
		System.out.println("Digite um n�mero: ");
		num = ler.nextInt();
		
		if(num % 2 == 0) {
			if(num >= 0) {
				System.out.println("O n�mero " + num + " � par e positivo.");
			}
			else {
				System.out.println("O n�mero " + num + " � par e negativo");
			}
		}
		else {
			if(num >= 0) {
				System.out.println("O n�mero " + num + " � impar e positivo.");
			}
			else {
				System.out.println("O n�mero " + num + " � impar e negativo");
			}
		}

	}

}
