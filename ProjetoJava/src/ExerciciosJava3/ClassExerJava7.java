package ExerciciosJava3;

import java.util.Scanner;
public class ClassExerJava7 {

	/*7) Receber valores de base e altura de um triângulo e 
	 * verificar se são valores válidos (positivos maiores que zero). 
	 * Em caso afirmativo, calcular a área do triângulo.*/
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        double  base, alt , area;
        
        System.out.println("Informe o valor da base do triângulo: ");
        base = ler.nextDouble();
        
        System.out.println("Informe o valor da altura do triângulo: ");
        alt = ler.nextDouble();
        
        if(base <=0 && alt <=0) {
        	System.out.println("Valores Inválidos");
        }
        else {
        	area = (base * alt) / 2;
        	System.out.println("A área do triângulo é de: " + area);
        }
        
	}

}
