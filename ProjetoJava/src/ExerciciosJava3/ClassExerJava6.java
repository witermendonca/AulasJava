package ExerciciosJava3;
import java.util.Scanner;
public class ClassExerJava6 {
   /*6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
		Infantil A = 5 a 7 anos
		Infantil B = 8 a 11 anos
		Juvenil A = 12 a 13 anos
		Juvenil B = 14 a 17 anos
		Adultos = Maiores de 18 anos
		*/
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
        String name;
        int idade;
        System.out.println("Informe o nome do nadador: ");
        name = ler.next();
        
        System.out.println("Informe a idade do nadaor: ");
        idade = ler.nextInt();
        
        if (idade < 5) {
        	System.out.println("Categoria não encontrada.");
        }
        else if(idade >= 5 && idade <8) {
        	System.out.println("Nadador: " + name + " Idade: " + idade + " anos");
        	System.out.println("Categoria Infantil A");
        }
        else if(idade >= 8 && idade <12) {
        	System.out.println("Nadador: " + name + " Idade: " + idade + " anos");
        	System.out.println("Categoria Infantil B");
        }
        else if(idade >= 12 && idade <14) {
        	System.out.println("Nadador: " + name + " Idade: " + idade + " anos");
        	System.out.println("Categoria Juvenil A");
        }
        else if(idade >= 14 && idade <18) {
        	System.out.println("Nadador: " + name + " Idade: " + idade + " anos");
        	System.out.println("Categoria Juvenil B");
        }
        else {
        	System.out.println("Nadador: " + name + " Idade: " + idade + " anos");
        	System.out.println("Categoria Adulto");
        }
	}

}
