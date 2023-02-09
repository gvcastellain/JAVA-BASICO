import java.util.Scanner;

public class Ex10 {

	private Ex10() {
        
		Scanner teclado = new Scanner(System.in);

		int vetor[] = new int[50];
		int finalizar = 0; 

		int select;
		do {
			System.out.println(" ________ MENU ________");
			System.out.println("  1 – Incluir valor");
			System.out.println("  2 – Pesquisar valor");
			System.out.println("  3 – Alterar valor");
			System.out.println("  4 – Excluir valor");
			System.out.println("  5 – Mostrar valores");
			System.out.println("  6 – Ordenar valores");
			System.out.println("  7 – Sair do sistema");
			System.out.print(" Opção: ");
			select = teclado.nextInt();
			switch (select) {
				case 1:
					finalizar = incluirValores(vetor, finalizar, teclado);
					break;
				case 2:
					pesquisarValores(vetor, finalizar, teclado);
					break;
				case 3:
					alterarValores(vetor, finalizar, teclado);
					break;
				case 4:
					finalizar = excluirValores(vetor, finalizar, teclado);
					break;
				case 5:
					mostrarValores(vetor, finalizar);
					break;
				case 6:
					ordenarValores(vetor, finalizar);
					break;
				case 7:
					System.out.println(" __ FIM __ ");
					break;
				default:
					System.out.println(" .. opção inválida .. ");
					break;
			}
		} while (select != 7);
	}

	public int incluirValores(int vetor[], int finalizar, Scanner teclado) {
		if (finalizar < vetor.length) {
			System.out.print(" valor: ");
			vetor[finalizar] = teclado.nextInt();
			finalizar++;
			System.out.println("_ incluído em vetor[" + finalizar + "].");
		} else {
			System.out.println(" .. não incluído - vetoror cheio .. ");
		}
		return finalizar;
	}

	public int pesquisarValores(int vetor[], int finalizar, Scanner teclado) {
		System.out.print(" valor pesquisa: ");
		int valor = teclado.nextInt();
		for (int i = 0; i < finalizar; i++) {
			if (valor == vetor[i]) {
				System.out.println("_ encontrado vetor[" + i + "]");
				return i;
			}
		}
		System.out.println("_ Não encontrado.");
		return -1;
	}

	public void alterarValores(int vetor[], int finalizar, Scanner teclado) {
		int ID = pesquisarValores(vetor, finalizar, teclado);
		if (ID != -1) {
			System.out.print(" valor troca: ");
			vetor[ID] = teclado.nextInt();
			System.out.println("_ valor troca vetor[" + ID + "]: " + vetor[ID]);
		}
	}

	public int excluirValores(int vetor[], int finalizar, Scanner teclado) {
		int ID = pesquisarValores(vetor, finalizar, teclado);
		if (ID != -1) {
			for (int i = ID; i < (finalizar - 1); i++) {
				vetor[i] = vetor[i + 1];
			}
			finalizar--;
			System.out.println("_ valor excluído.");
		}
		return finalizar;
	}

	public void mostrarValores(int vetor[], int finalizar) {
		System.out.println(" __ vetoror valores __ ");
		for (int i = 0; i < finalizar; i++) {
			System.out.println("vetor[" + i + "] " + vetor[i]);
		}
	}

	public void ordenarValores (int vetor[], int finalizar) {
		int bolha;
		for (int i = 0; i < finalizar - 1; i++) {
			if (vetor[i] > vetor[i + 1]) {
				bolha = vetor[i];
				vetor[i] = vetor[i + 1];
				vetor[i + 1] = bolha;
				i = -1;
			}
		}
		System.out.println("_ valores ordenados.");
	}

	public static void main(String[] args) {
		new Ex10();
	}

}