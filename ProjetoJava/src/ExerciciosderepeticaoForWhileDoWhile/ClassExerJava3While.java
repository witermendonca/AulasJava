package ExerciciosderepeticaoForWhileDoWhile;
import java.util.*;
public class ClassExerJava3While {

	/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
	 * Total de pessoas com mais de 50 anos. 
	 * O programa termina quando idade for =-99. (WHILE)
	 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade = 0, qtd21 = 0, qtd50 = 0;
		while (idade != -99) {
			
			System.out.println("Informe a idade: ");
			idade = ler.nextInt();
			
			if (idade < 21 && idade > 0 ) {
				
				qtd21++;
			}
			else if( idade > 50) {
				
				qtd50 ++;
			}
		}
		System.out.println("Total de pessoas menosres que 21 anos é de " + qtd21 + " pessoas.");
		
		System.out.println("Total de pessoas maiores que 50 anos é de " + qtd50 + " pessoas.");
		
		

	}

}
