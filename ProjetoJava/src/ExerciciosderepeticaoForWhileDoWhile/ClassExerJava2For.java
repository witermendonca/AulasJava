package ExerciciosderepeticaoForWhileDoWhile;
import java.util.*;
public class ClassExerJava2For {

	//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			int num , impar =0 , par = 0;
			
			for (int x = 0 ; x < 10; x++) {
				
				System.out.println("digite o " + (x+1) + "� n�mero: ");
				num = ler.nextInt();
				if(num % 2 == 0) { 
					
					par++;
				}
				else {
					impar++;
				}
				
			}
			System.out.println("A quantidade de n�meros PARES dentro os digitados � de: " + par);
			
			System.out.println("A quantidade de n�meros IMPARES dentro os digitados � de: " + impar);
		}

}
