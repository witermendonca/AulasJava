package ExerciciosJava3;
import java.util.Scanner;
public class ClassExerJava5 {
     /*5) A Secretaria de Meio Ambiente que controla
      *o �ndice de polui��o mant�m 3 grupos de ind�strias que s�o altamente poluentes do meio ambiente. 
      *O �ndice de polui��o aceit�vel varia de 0,05 at� 0,25. 
      *Se o �ndice sobe para 0,3 as ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades, 
      *se o �ndice crescer para 0,4 as industrias do 1� e 2� grupo s�o intimadas 
      *a suspenderem suas atividades, 
      *se o �ndice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 
      *Fa�a um sistema que leia o �ndice de polui��o medido e emita a 
      *notifica��o adequada aos diferentes grupos de empresas.
*/
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double indice; 
		System.out.println("Informe o �ndice de polui��o: ");
		indice = ler.nextDouble();
		
		if(indice < 0.3) {
			System.out.println("O �ndice de polui��o est� em " + indice
					+ "\nO �ndice de polui��o esta aceitavel.");
		}
		else if(indice >= 0.3 && indice < 0.4) {
			System.out.println("O �ndice de polui��o est� em " + indice
					+ "\nAs Ind�strias pertencente ao Grupo 1, devem suspender suas atividades.");
		}
		else if(indice >= 0.4 && indice < 0.5) {
				System.out.println("O �ndice de polui��o est� em " + indice
						+ "\nAs Ind�strias pertencente ao Grupo 1 e 2, devem suspender suas atividades.");
			}
		else {
			System.out.println("O �ndice de polui��o est� em " + indice
					+ "\nAs Ind�strias de todos os grupos devem suspender suas atividades.");
		}
		

	}

}
