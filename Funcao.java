package Functions;

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

}
