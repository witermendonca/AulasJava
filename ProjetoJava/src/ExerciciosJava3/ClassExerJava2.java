package ExerciciosJava3;
import java.util.*;
public class ClassExerJava2 {

	/*2)Elabore um sistema que leia as vari�veis C e N,
	 *respectivamente c�digo e n�mero de horas trabalhadas de um oper�rio.
	 *E calcule o sal�rio sabendo-se que ele ganha R$ 10,00 por hora.
	 *Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento 
	 *armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel. 
	 *A hora excedente de trabalho vale R$ 20,00. 
	 *No final do processamento imprimir o sal�rio total e o sal�rio excedente.
      */
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String codTrab ;
		double horas,salario, salarioTotal , salarioExtra;
		System.out.println("Informe o codigo do funcionario: ");
		codTrab = ler.next();
		
		System.out.println("Informe o n�mero de horas trabalhadas: ");
		horas = ler.nextDouble();
		
		if(horas <= 50) {
			salario = horas * 10.00;
			salarioExtra = 0;
			salarioTotal = salario + salarioExtra ;
			System.out.println("Funcionario codigo: "+ codTrab);
			System.out.println("Sal�rio horas Exedentes: " + salarioExtra + " reais");
			System.out.println("Salario total: "+ salarioTotal + " reais");
			
		}
		else {
			salarioExtra = (horas - 50) * 20.00;
			salario = 500;
			salarioTotal = salario + salarioExtra;
			System.out.println("Funcionario codigo: "+ codTrab);
			System.out.println("Sal�rio horas Exedentes: " + salarioExtra + " reais");
			System.out.println("Salario total: "+ salarioTotal + " reais");
			
					
		}
		

	}

}
