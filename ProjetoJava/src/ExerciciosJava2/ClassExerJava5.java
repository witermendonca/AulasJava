package ExerciciosJava2;

import java.util.Scanner;
public class ClassExerJava5 {

	/*5.Faça um sistema que leia a idade de uma pessoa
	 *expressa em anos, meses e dias e mostre-a expressa apenas em dias.*/
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int anos, meses, dias, idadeDias;
		System.out.println("Digite sua idade \nAnos: ");
		anos = ler.nextInt();
		
		System.out.println("Meses: ");
	    meses = ler.nextInt();
		
		System.out.println("Dias: ");
		dias = ler.nextInt();
		
		idadeDias = anos * 365 + meses * 30 + dias;
		
		System.out.println("Sua idade em dias é de: "+ idadeDias);
	}
	
}
