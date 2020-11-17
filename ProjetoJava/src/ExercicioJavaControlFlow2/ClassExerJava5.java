package ExercicioJavaControlFlow2;

import java.util.Scanner;
public class ClassExerJava5 {

	/*Acrescente as seguintes mensagens à solução do exercício anterior conforme o caso. 
	−  Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO. 
	− Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO. 
*/
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int lados, medida;
		double area ;
		System.out.println("Informe o número de lados de um polígono regular: ");
		lados = ler.nextInt();
		
		System.out.println("Informe a medida do lado (em cm): ");
		medida = ler.nextInt();
		
		if(lados == 3) {
			area = (Math.pow(lados, 2) * Math.sqrt(3)) / 4;
			System.out.println("Este polígono é um TRIÂNGULO \nO valor da sua área é de: " + area + "cm");
		}
		else if(lados == 4) {
			area = medida * medida ;
			System.out.println("Este polígono é um QUADRADO \nO valor da sua área é de: " + area + "cm");
		}
		else if(lados == 5){
			System.out.println("Este polígono é um PENTÁGONO");
		}
		else if(lados < 3) {
			System.out.println("Número de lados invalido, NÃO É UM POLÍGONO.");
		}
		else {
			System.out.println("Número de lados invalido, POLÍGONO NÃO IDENTIFICADO.");
		}


	}

}
