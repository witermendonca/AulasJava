package SwitchCase;

import java.util.Scanner;
public class ClassTesteSwitch {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String cod ;
		System.out.println("Adicione um item a sua compra. Entre com o codigo do produto: ");
		cod = ler.next();
		
		switch (cod) {
		
		case "001":
			System.out.println("Item codigo 001 add á compra : X Salada");
			break;
		case "002":
			System.out.println("Item codigo 002 add á compra : X Bacon");
			break;
		case "003":
			System.out.println("Item codigo 003 add á compra : X Frango");
			break;
		case "004":
			System.out.println("Item codigo 004 add á compra : X Tudo");
			break;
			default :
				System.out.println("Codigo invalido");
				
		}

	}

}
