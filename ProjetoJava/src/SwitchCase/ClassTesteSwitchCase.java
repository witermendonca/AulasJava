package SwitchCase;

import java.util.Scanner;

public class ClassTesteSwitchCase {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int  x = 1;
		String cod ;
		double cod001 = 10.00, cod002 = 15.00, cod003 = 17.00 , cod004 = 20.00, soma =0;
		System.out.println("Deseja fazer seu pedido?");
		
		do {
		System.out.println("Adicione um item a sua compra. Entre com o codigo do produto: ");
		cod = ler.next();
		
		switch (cod) {
		
		case "cod001":
			System.out.println("Item codigo 001 add á compra : X Salada");
			soma = soma + cod001;
			break;
		case "cod002":
			System.out.println("Item codigo 002 add á compra : X Bacon");
			soma = soma + cod002;
			break;
		case "cod003":
			System.out.println("Item codigo 003 add á compra : X Frango");
			soma = soma + cod003;
			break;
		case "cod004":
			System.out.println("Item codigo 004 add á compra : X Tudo");
			soma = soma + cod004;
			break;
			default :
				System.out.println("Codigo invalido");
				
		}
		
		System.out.println("Digite 1 para add mais item ao pedido e 2 para finalizar o pedido");
		x = ler.nextInt();
		
		}while (x != 2);
         System.out.println("O valor do seu pedido é de: " + soma + "reais");

	}

}
