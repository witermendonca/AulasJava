package ExerciciosderepeticaoForWhileDoWhile;
import java.util.*;
public class ClassExerJava2For {

	//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			int num , impar =0 , par = 0;
			
			for (int x = 0 ; x < 10; x++) {
				
				System.out.println("digite o " + (x+1) + "° número: ");
				num = ler.nextInt();
				if(num % 2 == 0) { 
					
					par++;
				}
				else {
					impar++;
				}
				
			}
			System.out.println("A quantidade de números PARES dentro os digitados é de: " + par);
			
			System.out.println("A quantidade de números IMPARES dentro os digitados é de: " + impar);
		}

}
