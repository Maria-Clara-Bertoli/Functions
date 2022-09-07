package Functions;

import java.util.Scanner;

public class NumeroCinco {

	public static void main(String[] args) {
	
		Scanner valor = new Scanner(System.in);
		Funcao function = new Funcao();
		System.out.println("Informe o valor do custo do produto: ");
		float custo = valor.nextFloat();
		System.out.println("Informe a taxa de imposto cobrada sobre o produto: ");
		float taxaimposto = valor.nextFloat();
		
		System.out.println("O valor do produto com o acréscimo de imposto é: " + function.AcrescentaImposto(taxaimposto, custo));
		
		valor.close();

	}

}
