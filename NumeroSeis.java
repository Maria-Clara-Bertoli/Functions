package Functions;

import java.util.Scanner;

public class NumeroSeis {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		Funcao function = new Funcao();
		String vet[] = new String[2];
		String valida = "";
		
		do {
		System.out.println("Informe a quantidade de horas que deverão ser convertidas no formato 'hh:mm': ");
		String tempo = valor.nextLine();
		vet = tempo.split(":");
		int hora = Integer.valueOf(vet[0]);
		int minuto = Integer.valueOf(vet[1]);
		System.out.println("Informe se é antes do meio dia 'A' ou depois do meio dia 'P': ");
		String ampm = valor.next();
		System.out.println(function.saida(hora, minuto, ampm));
		valor.nextLine();
		System.out.println("Deseja continuar? Digite 'S/N': ");
		valida = valor.nextLine();
		}while(valida.equalsIgnoreCase("S"));
		
		valor.close();

	}

}
