package ExerciciosderepeticaoForWhileDoWhile;

import java.util.Scanner;
public class ClassExerJava6For {

	/* A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o sal�rio e n�mero de filhos. 
	   A prefeitura deseja saber:   
		a) m�dia do sal�rio da popula��o; 
		b) m�dia do n�mero de filhos; 
		c) maior sal�rio; 
		d) percentual de pessoas com sal�rio at� R$100,00.  (FOR)*/
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int h , filhos, mediaFil=0, pessoaSal =0100;
		double salario , mediaSal=0  , salarioM =0;
		for (h = 0; h < 20; h++) {
			
			System.out.println("Habitante "+(h+1)+"\nInforme o valor do seu salario: ");
			salario = ler.nextDouble();
			
			System.out.println("Informe quantos filhos voc� tem: ");
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
		System.out.println("A m�dia do sal�rio da popula��o � de: " + (mediaSal / 20) + " reais.");
		System.out.println("A m�dia do numero de filhos da popula��o � de: " + (mediaFil / 20));
		System.out.println("o maoir s�lario registrado foi de: " + salarioM + " reais.");
		System.out.println("O percentual de pessoas com sal�rio at� R$100,00 � de: " + (pessoaSal*100 /20 )+ "%");

	}

}
