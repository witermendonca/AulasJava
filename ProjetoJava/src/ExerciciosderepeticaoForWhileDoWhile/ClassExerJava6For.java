package ExerciciosderepeticaoForWhileDoWhile;

import java.util.Scanner;
public class ClassExerJava6For {

	/* A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. 
	   A prefeitura deseja saber:   
		a) média do salário da população; 
		b) média do número de filhos; 
		c) maior salário; 
		d) percentual de pessoas com salário até R$100,00.  (FOR)*/
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int h , filhos, mediaFil=0, pessoaSal =0100;
		double salario , mediaSal=0  , salarioM =0;
		for (h = 0; h < 20; h++) {
			
			System.out.println("Habitante "+(h+1)+"\nInforme o valor do seu salario: ");
			salario = ler.nextDouble();
			
			System.out.println("Informe quantos filhos você tem: ");
			filhos = ler.nextInt();
			
		     mediaSal = salario + mediaSal;
		     mediaFil = filhos+ mediaFil;
		     
		     if (salario > salarioM) {
		    	 
		    	 salarioM = salario;
		     }
		     if (salario <= 100.0) {
		    	 
		    	 pessoaSal++;
		     }
		     
		    
			
			
		}
		System.out.println("A média do salário da população é de: " + (mediaSal / 20) + " reais.");
		System.out.println("A média do numero de filhos da população é de: " + (mediaFil / 20));
		System.out.println("o maoir sálario registrado foi de: " + salarioM + " reais.");
		System.out.println("O percentual de pessoas com salário até R$100,00 é de: " + (pessoaSal*100 /20 )+ "%");

	}

}
