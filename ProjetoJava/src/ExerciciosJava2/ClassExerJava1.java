package ExerciciosJava2;

import java.util.Locale;
import java.util.Scanner;
public class ClassExerJava1 {
		
	 /*1.Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno.
		Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.*/
		
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			ler.useLocale(Locale.US);
			String nome;
			float nota1, nota2, nota3, media;
			
			System.out.println("Digite o nome do aluno: ");
			nome = ler.next();
			
			System.out.println("Digite a 1� nota: ");
			nota1 = ler.nextFloat();
			
			System.out.println("Digite a 2� nota: ");
			nota2 = ler.nextFloat();
			
			System.out.println("Digite a 3� nota: ");
			nota3 = ler.nextFloat();
			
			media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2+3+5) ;
			
			System.out.println("A m�dia final do aluno "+ nome + " � de: "+ media);
			

		}

	}


