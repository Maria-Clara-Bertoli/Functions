package Functions;

import java.util.Scanner;

public class NumeroQuatro {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		Funcao function = new Funcao();
		
		System.out.println("Informe um número inteiro: ");
		int inteiro = valor.nextInt();
		System.out.println(function.Verifica(inteiro));
		
		valor.close();

	}

}
