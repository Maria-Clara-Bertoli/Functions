package Functions;

import java.util.Scanner;

public class NumeroOito {

	public static void main(String[] args) {
		

		Scanner valor = new Scanner(System.in);
		Funcao function = new Funcao();
		
		System.out.println("Informe um número: ");
		int numero = valor.nextInt();
		System.out.println(function.QuantidadeDigito(numero)); 
		
		valor.close();

	}

}
