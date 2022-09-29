import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();

		try {
			// chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

		} catch (Exception exception) {
			// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro.
			exception.printStackTrace();
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		terminal.close();
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > 0 && parametroDois > parametroUm) {
			int contagem = parametroDois - parametroUm;
			for (int i = 1; i <= contagem; i++) {
				System.out.println("Imprimindo o número " + i);
			}
		} else {
			throw new ParametrosInvalidosException();
		}
		// realizar o for para imprimir os números com base na variável contagem

	}
}