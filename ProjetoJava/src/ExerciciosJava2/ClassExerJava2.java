package ExerciciosJava2;

import java.util.Scanner;
public class ClassExerJava2 {

	/*2.O custo ao consumidor de um carro novo � a soma do custo de f�brica
	 *com a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
	 *Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	 *escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor.
	 * */
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float valorLoja , valorCons;
		
		System.out.println("Digite o valor de fabrica do veiculo: ");
		 valorLoja = ler.nextFloat();
		
		 valorCons = (valorLoja * 28/100)+(valorLoja * 45/100)+ valorLoja;
		
		System.out.println("O custo do veiculo ao consumidor � de: "+ valorCons);
	}

}
