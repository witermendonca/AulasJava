package ExerciciosJava2;

import java.util.Scanner;
public class ClassExerJava3 {
   /*3.Escreva um sistema que leia três números inteiros e positivos (A, B, C)
    *  e calcule a seguinte expressão:  D = R+S / 2 , onde   R=(A+B)² S=(B+C)² .*/
	
	public static void main(String[] args) {
	
    int a, b, c;
    double r, s, d;
	Scanner ler = new Scanner(System.in);
	
    System.out.println("Digite o valor de A: ");
    a = ler.nextInt();
    
    System.out.println("Digite o valor de B: ");
    b = ler.nextInt();
	
    System.out.println("Digite o valor de C: ");
    c = ler.nextInt();
	
    r= Math.pow(a+b , 2);
    s= Math.pow(b+c, 2);
    
    d= (r+s)/ 2;
    
    System.out.println("O calculo da expressão é de: "+ d);
    
	}

}
