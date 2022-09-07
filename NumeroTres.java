package Functions;

import java.util.Scanner;

public class NumeroTres {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		Funcao function = new Funcao();
		
		System.out.println("Informe três valores.");
		System.out.println("Valor um: ");
		int argumentoum = valor.nextInt();
		System.out.println("Valor dois: ");
		int argumentodois = valor.nextInt();
		System.out.println("Valor três: ");
		int argumentotres = valor.nextInt();
		
		System.out.println("A soma é: " + function.SomaValor(argumentoum, argumentodois, argumentotres));
		
		valor.close();

	}

}
