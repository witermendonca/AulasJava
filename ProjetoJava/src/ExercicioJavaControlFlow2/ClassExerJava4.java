package ExercicioJavaControlFlow2;

import java.util.Scanner;
public class ClassExerJava4 {

	/*4.Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm).
	 * Calcular e imprimir o seguinte:
	  − Se o número de lados for igual a 3 escrever TRI NGULO e o valor da área 
      − Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área. 
      − Se o número de lados for igual a 5 escrever PENTÁGONO.
	 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int lados, medida;
		double area;
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
		else {
			System.out.println("Número de lados invalido, tente novamente.");
		}

	}

}
