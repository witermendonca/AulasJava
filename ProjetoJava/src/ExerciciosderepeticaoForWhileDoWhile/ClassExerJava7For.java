package ExerciciosderepeticaoForWhileDoWhile;

public class ClassExerJava7For {

	/*Desenvolver um sistema que efetue a soma de todos os n�meros �mpares que s�o  m�ltiplos de tr�s 
	 *e que se encontram no conjunto dos n�meros de 1 at� 500. (FOR)*/
	public static void main(String[] args) {
		
        int x , soma = 0;
		for( x = 1 ; x <= 500; x++) {
			
			if(x % 2 != 0 && x % 3 == 0) {
				
				soma = x + soma;
			}
		}
		
		System.out.println("A soma de todos os n�meros �mpares que s�o  m�ltiplos de tr�s\n"
				          + "E que se encontram no conjunto dos n�meros de 1 at� 500 � de: " + soma );
	}
	

}
