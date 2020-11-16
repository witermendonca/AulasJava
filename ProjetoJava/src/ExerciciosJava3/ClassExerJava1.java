package ExerciciosJava3;
import java.util.*;
public class ClassExerJava1 {
    /*1) João TOMATEIRO, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
     * Toda vez que ele traz um peso de tomate maior que o estabelecido 
     * pelo regulamento do estado de São Paulo (50 quilos) 
     * deve pagar um multa de R$ 4,00 por quilo excedente. 
     * João precisa que você faça um sistema que leia a variável P (peso de tomates) 
     * e verifique se há excesso. Se houver, gravar na variável E (Excesso) 
     * e na variável M o valor da multa que João deverá pagar. 
     * Caso contrário mostrar tais variáveis com o conteúdo ZERO.*/
	
	public static void main(String[] args) {
		 
		Scanner ler = new Scanner(System.in);
		double p, e, m;
		System.out.println("Informe o peso total: ");
		p = ler.nextDouble();
		
		if (p <= 50) {
			e = 0;
			m = 0;
			System.out.println("O peso total é de: "+ p + " kg");
			System.out.println("O peso excedente ou estabelecido pelo regulamento é de: "+ e + " kg");
			System.out.println("O valor da multa por exceder ao regulamente é de: "+ m + " reais");
		}
		else {
			e = p - 50;
			m = e * 4.00;
			System.out.println("O peso total é de: "+ p + " kg");
			System.out.println("O peso excedente ou estabelecido pelo regulamento é de: "+ e + " kg");
			System.out.println("O valor da multa por exceder ao regulamente é de: "+ m + " reais");
			
		}
	}

}
