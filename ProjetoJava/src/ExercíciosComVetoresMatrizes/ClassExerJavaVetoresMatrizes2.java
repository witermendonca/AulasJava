package ExercíciosComVetoresMatrizes;

import java.util.Scanner;
public class ClassExerJavaVetoresMatrizes2 {

	/*2.	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
	b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
	*/
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int [][] n1 = new int [4][6], n2 = new int [4][6], m1 = new int [4][6],  m2 = new int [4][6];
	    int l, c;
		
		System.out.println("Matriz N1");
		
		for(l = 0; l < 4; l++) {
			
					for(c = 0; c < 6; c++) {
						System.out.println("Informe o valor da linha "+(l+1)+" coluna "+(c+1)+" :");
						n1 [l][c] = ler.nextInt();
					}
				}
		System.out.println("Matriz N2");
		
		for(l = 0; l < 4; l++) {
					
					for(c = 0; c < 6; c++) {
						System.out.println("Informe o valor da linha "+(l+1)+" coluna "+(c+1)+" :");
						n2 [l][c] = ler.nextInt();
					}
				}
		
		for(l = 0; l < 4; l++) {
					
					for(c = 0; c < 6; c++) {
						m1 [l][c] = n1 [l][c] + n2 [l][c];
						
						m2 [l][c] = n1 [l][c] - n2 [l][c];	
					}
				}
		System.out.println("As somas dos elementos de mesma posição das matrizes N1 e N2 são: ");

		for(l = 0; l < 4; l++) {
					
					for(c = 0; c < 6; c++) {
						System.out.println("\n"+m1 [l][c]);
					}
				}
		
		System.out.println("As diferenças dos elementos de mesma posição das matrizes N1 e N2 são: ");
		for(l = 0; l < 4; l++) {
			
			for(c = 0; c < 6; c++) {
				System.out.println("\n"+m2 [l][c]);
			}
		} 

		

	}

}
