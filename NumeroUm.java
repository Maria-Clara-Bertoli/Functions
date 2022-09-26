package Functions;

import java.util.Scanner;

public class NumeroUm {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);
		Funcao function = new Funcao();

		System.out.println("Informe o tamanho da saída: ");
		int tamanho = valor.nextInt();
		System.out.println(function.ImprimeLinhaHorizontal(tamanho));

		valor.close();
	}

}
