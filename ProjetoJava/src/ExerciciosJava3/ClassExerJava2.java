package ExerciciosJava3;
import java.util.*;
public class ClassExerJava2 {

	/*2)Elabore um sistema que leia as variáveis C e N,
	 *respectivamente código e número de horas trabalhadas de um operário.
	 *E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora.
	 *Quando o número de horas exceder a 50 calcule o excesso de pagamento 
	 *armazenando-o na variável E, caso contrário zerar tal variável. 
	 *A hora excedente de trabalho vale R$ 20,00. 
	 *No final do processamento imprimir o salário total e o salário excedente.
      */
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String codTrab ;
		double horas,salario, salarioTotal , salarioExtra;
		System.out.println("Informe o codigo do funcionario: ");
		codTrab = ler.next();
		
		System.out.println("Informe o número de horas trabalhadas: ");
		horas = ler.nextDouble();
		
		if(horas <= 50) {
			salario = horas * 10.00;
			salarioExtra = 0;
			salarioTotal = salario + salarioExtra ;
			System.out.println("Funcionario codigo: "+ codTrab);
			System.out.println("Salário horas Exedentes: " + salarioExtra + " reais");
			System.out.println("Salario total: "+ salarioTotal + " reais");
			
		}
		else {
			salarioExtra = (horas - 50) * 20.00;
			salario = 500;
			salarioTotal = salario + salarioExtra;
			System.out.println("Funcionario codigo: "+ codTrab);
			System.out.println("Salário horas Exedentes: " + salarioExtra + " reais");
			System.out.println("Salario total: "+ salarioTotal + " reais");
			
					
		}
		

	}

}
