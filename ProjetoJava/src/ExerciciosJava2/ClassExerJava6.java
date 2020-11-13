package ExerciciosJava2;

import java.util.Scanner;
public class ClassExerJava6 {
    
	/*6.Faça um sistema que leia a idade de uma pessoa
	 *expressa em dias e mostre-a expressa em anos, meses e dias.*/
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade, anos, meses, dias;
		System.out.println("Digite sua idade em dias: ");
		idade = ler.nextInt();
		
		anos = idade / 365;
		meses = (idade % 365) / 30;
		dias = (idade % 365) % 30;
		
		System.out.println("Sua idade expressa em anos, meses e dias é: \n"
				           + anos + " anos\n" + meses + " meses\n" + dias + " dias");
		
		

	}

}
