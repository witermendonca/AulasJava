package ExerciciosderepeticaoForWhileDoWhile;

public class ClassExerJava10DoWhile {

	/*Fa�a um programa que mostre uma contagem na tela de 233 a 456, 
	 *s� que contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando n�o estiver. (DO...WHILE)
    */
	public static void main(String[] args) {
		int x = 233;
		do {
			 System.out.println(x);
			if (x >=300 && x <= 400 ) {
				x = x+3;
			}
			else {
				x = x + 5;
			}
			
		}while(x <= 456);
	      
	}

}
