package ExerciciosJava3;
import java.util.*;
public class ClassExerJava1 {
    /*1) Jo�o TOMATEIRO, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho. 
     * Toda vez que ele traz um peso de tomate maior que o estabelecido 
     * pelo regulamento do estado de S�o Paulo (50 quilos) 
     * deve pagar um multa de R$ 4,00 por quilo excedente. 
     * Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P (peso de tomates) 
     * e verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) 
     * e na vari�vel M o valor da multa que Jo�o dever� pagar. 
     * Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.*/
	
	public static void main(String[] args) {
		 
		Scanner ler = new Scanner(System.in);
		double p, e, m;
		System.out.println("Informe o peso total: ");
		p = ler.nextDouble();
		
		if (p <= 50) {
			e = 0;
			m = 0;
			System.out.println("O peso total � de: "+ p + " kg");
			System.out.println("O peso excedente ou estabelecido pelo regulamento � de: "+ e + " kg");
			System.out.println("O valor da multa por exceder ao regulamente � de: "+ m + " reais");
		}
		else {
			e = p - 50;
			m = e * 4.00;
			System.out.println("O peso total � de: "+ p + " kg");
			System.out.println("O peso excedente ou estabelecido pelo regulamento � de: "+ e + " kg");
			System.out.println("O valor da multa por exceder ao regulamente � de: "+ m + " reais");
			
		}
	}

}
