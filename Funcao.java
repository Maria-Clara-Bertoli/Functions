package Functions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;

public class Funcao {

	public String ImprimeLinhaHorizontal(int tamanho) {
		StringBuilder saida = new StringBuilder();
		for (int i = 1; i <= tamanho; i++) {
			saida.append("\n");
			int n = i;
			for (int j = 1; j <= i; j++) {
				saida.append(n);
				saida.append(", ");
			}
		}
		return saida.toString();
	}

	public String ImprimeLinhaVertical(int tamanho) {
		StringBuilder saida = new StringBuilder();
		for (int i = 1; i <= tamanho; i++) {
			saida.append("\n");
			for (int j = 1; j <= i; j++) {
				saida.append(j);
				saida.append(", ");
			}
		}
		return saida.toString();
	}

	public int SomaValor(int argumentoum, int argumentodois, int argumentotres) {
		return argumentoum + argumentodois + argumentotres;
	}

	public String Verifica(int inteiro) {
		if (inteiro > 0) {
			return "P";
		} else {
			return "N";
		}
	}

	public float AcrescentaImposto(float TaxaImposto, float Custo) {
		float custoadicional = (Custo / 100) * TaxaImposto;
		return Custo + custoadicional;
	}

	public int Conversao(int hora, String ampm) {
		if (ampm.equalsIgnoreCase("P")) {
			int conversao = hora - 12;
			return conversao;
		} else {
			int conversao = hora + 12;
			return conversao;
		}
	}

	public String saida(int hora, int minuto, String ampm) {
		StringBuilder saida = new StringBuilder();
		saida.append(Conversao(hora, ampm));
		saida.append(":");
		saida.append(minuto);
		saida.append(" ");
		if (ampm.equalsIgnoreCase("P")) {
			saida.append("A.M");
		} else {
			saida.append("P.M");
		}
		return saida.toString();
	}

	public int QuantidadeDigito(int numero) {
		String numeroconvertido = Integer.toString(numero);
		return numeroconvertido.length();
	}

	public String[] SeparaNumero(int numero) {
		String numeroconvertido = String.valueOf(numero);
		String vet[] = new String[numeroconvertido.length()];

		for (int i = 0; i < numeroconvertido.length(); i++) {
			vet[i] = numeroconvertido.substring(i, i + 1);
		}
		return vet;
	}

	public String MostraInvertido(int numero) {
		StringBuilder saida = new StringBuilder();
		String numeroconvertido = String.valueOf(numero);
		String vet[] = new String[numeroconvertido.length()];
		vet = SeparaNumero(numero);

		for (int i = numeroconvertido.length() - 1; i >= 0; i--) {
			saida.append(vet[i]);
		}

		return saida.toString();
	}

	public boolean ValidaData(String data) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			sdf.setLenient(false);
			sdf.parse(data);
			return true;
		} catch (ParseException ex) {
			System.out.println("A data é inválida!");
			return false;
		}
	}

	public String EscreveData(String data) {
		StringBuilder saida = new StringBuilder();
		if (ValidaData(data)) {
			String vet[] = data.split("/");
			saida.append(vet[0]);
			saida.append(" de ");
			if (vet[1].equals("01")) {
				saida.append("Janeiro");
			} else if (vet[1].equals("02")) {
				saida.append("Fevereiro");
			} else if (vet[1].equals("03")) {
				saida.append("Março");
			} else if (vet[1].equals("04")) {
				saida.append("Abril");
			} else if (vet[1].equals("05")) {
				saida.append("Maio");
			} else if (vet[1].equals("06")) {
				saida.append("Junho");
			} else if (vet[1].equals("07")) {
				saida.append("Julho");
			} else if (vet[1].equals("08")) {
				saida.append("Agosto");
			} else if (vet[1].equals("09")) {
				saida.append("Setembro");
			} else if (vet[1].equals("10")) {
				saida.append("Outubro");
			} else if (vet[1].equals("11")) {
				saida.append("Novembro");
			} else if (vet[1].equals("12")) {
				saida.append("Dezembro");
			}
			saida.append(" de ");
			saida.append(vet[2]);
		}
		return saida.toString();
	}

	public String[] EmbaralhaPalavra(String palavra) {
		boolean valida = true;
		int recebe = 0;
		ArrayList<Integer> lista = new ArrayList();
		Random aleatorio = new Random();
		String vet[] = new String[palavra.length()];
		String vetaleatorio[] = new String[palavra.length()];
		for (int i = 0; i < palavra.length(); i++) {
			vet[i] = palavra.substring(i, i + 1);
		}
		lista.add(100);
		for (int i = 0; i < palavra.length(); i++) {
			while (valida == true) {
				recebe = aleatorio.nextInt(palavra.length());
				for (int elemento : lista) {
					if (elemento == recebe) {
						valida = true;
						break;
					} else {
						valida = false;
					}
				}
				
			}
			if (valida == false) {
				vetaleatorio[i] = vet[recebe];
				lista.add(recebe);
				recebe = aleatorio.nextInt(palavra.length());
			}
		}
		return vetaleatorio;
	}

	public String MostraVetor(String palavra) {
		String vet[] = new String[palavra.length()];
		vet = EmbaralhaPalavra(palavra);
		StringBuilder saida = new StringBuilder();
		for (int i = 0; i < vet.length; i++) {
			saida.append(vet[i].toUpperCase());
		}
		return saida.toString();
	}
}
