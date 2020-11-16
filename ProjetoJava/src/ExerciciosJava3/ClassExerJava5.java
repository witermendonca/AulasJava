package ExerciciosJava3;
import java.util.Scanner;
public class ClassExerJava5 {
     /*5) A Secretaria de Meio Ambiente que controla
      *o índice de poluição mantém 3 grupos de indústrias que são altamente poluentes do meio ambiente. 
      *O índice de poluição aceitável varia de 0,05 até 0,25. 
      *Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades, 
      *se o índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas 
      *a suspenderem suas atividades, 
      *se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 
      *Faça um sistema que leia o índice de poluição medido e emita a 
      *notificação adequada aos diferentes grupos de empresas.
*/
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double indice; 
		System.out.println("Informe o índice de poluição: ");
		indice = ler.nextDouble();
		
		if(indice < 0.3) {
			System.out.println("O índice de poluição está em " + indice
					+ "\nO índice de poluição esta aceitavel.");
		}
		else if(indice >= 0.3 && indice < 0.4) {
			System.out.println("O índice de poluição está em " + indice
					+ "\nAs Indústrias pertencente ao Grupo 1, devem suspender suas atividades.");
		}
		else if(indice >= 0.4 && indice < 0.5) {
				System.out.println("O índice de poluição está em " + indice
						+ "\nAs Indústrias pertencente ao Grupo 1 e 2, devem suspender suas atividades.");
			}
		else {
			System.out.println("O índice de poluição está em " + indice
					+ "\nAs Indústrias de todos os grupos devem suspender suas atividades.");
		}
		

	}

}
