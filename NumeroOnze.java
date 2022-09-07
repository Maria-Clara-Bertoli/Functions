package Functions;

import java.util.Scanner;

public class NumeroOnze {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		Funcao function = new Funcao();
		
		System.out.println("Informe uma data no formato 'dd/MM/yyyy': ");
		String data = valor.nextLine();
		System.out.println(function.EscreveData(data));
		
		valor.close();

	}

}
