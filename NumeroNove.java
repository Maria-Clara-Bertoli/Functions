package Functions;

import java.util.Scanner;

public class NumeroNove {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		Funcao function = new Funcao();
		
		System.out.println("Informe um n�mero: ");
		int numero = valor.nextInt();
		System.out.println("N�mero Invertido: ");
		System.out.println(function.MostraInvertido(numero));
		
		valor.close();
	}

}
