package ExerciciosJava3;

import java.util.Scanner;
public class ClassExerJava7 {

	/*7) Receber valores de base e altura de um tri�ngulo e 
	 * verificar se s�o valores v�lidos (positivos maiores que zero). 
	 * Em caso afirmativo, calcular a �rea do tri�ngulo.*/
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        double  base, alt , area;
        
        System.out.println("Informe o valor da base do tri�ngulo: ");
        base = ler.nextDouble();
        
        System.out.println("Informe o valor da altura do tri�ngulo: ");
        alt = ler.nextDouble();
        
        if(base <=0 && alt <=0) {
        	System.out.println("Valores Inv�lidos");
        }
        else {
        	area = (base * alt) / 2;
        	System.out.println("A �rea do tri�ngulo � de: " + area);
        }
        
	}

}
