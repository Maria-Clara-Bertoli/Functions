package Functions;

import java.util.Scanner;

public class NumeroDois {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		Funcao function = new Funcao();
		
		System.out.println("Informe o tamanho da sa�da: ");
		int tamanho = valor.nextInt();
		System.out.println(function.ImprimeLinhaVertical(tamanho));
		
		valor.close();

	}

}
