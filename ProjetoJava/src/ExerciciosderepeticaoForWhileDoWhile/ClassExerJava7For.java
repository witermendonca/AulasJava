package ExerciciosderepeticaoForWhileDoWhile;

public class ClassExerJava7For {

	/*Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três 
	 *e que se encontram no conjunto dos números de 1 até 500. (FOR)*/
	public static void main(String[] args) {
		
        int x , soma = 0;
		for( x = 1 ; x <= 500; x++) {
			
			if(x % 2 != 0 && x % 3 == 0) {
				
				soma = x + soma;
			}
		}
		
		System.out.println("A soma de todos os números ímpares que são  múltiplos de três\n"
				          + "E que se encontram no conjunto dos números de 1 até 500 é de: " + soma );
	}
	

}
