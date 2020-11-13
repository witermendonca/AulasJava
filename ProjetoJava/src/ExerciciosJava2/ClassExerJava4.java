package ExerciciosJava2;

import java.util.Scanner;
public class ClassExerJava4 {
    
	/*4.Faça um sistema que leia o tempo de duração de um evento em uma fábrica
	 *  expressa em segundos e mostre-o expresso em horas, minutos e segundos
*/
	public static void main(String[] args) {
	    
		int totalS, horas, minutos, segundos;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o tempo de duração do evento em segundos: ");
		totalS = ler.nextInt();
		
		horas = totalS / 3600;
		minutos = (totalS % 3600) / 60;
		segundos = (totalS % 3600) % 60;
		
		System.out.println("O tempo de duração do evento em horas, minutos e segundos foi de: "
				+ "\n" + horas + ":" + minutos + ":" + segundos);
 
	}

}
