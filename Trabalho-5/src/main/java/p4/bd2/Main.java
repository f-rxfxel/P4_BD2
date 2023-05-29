package p4.bd2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean sair = false;

		while (!sair) {
			System.out.println("=| Menu |=");
			System.out.println("1. Criar");
			System.out.println("2. Pesquisar");
			System.out.println("3. Deletar");
			System.out.println("4. Exibir cadastros");
			System.out.println("5. Sair");
			System.out.print("> ");

			int opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				// Criar
				System.out.println("Escolha uma opção:");
				System.out.println("1. Quarto");
				System.out.println("2. Titular");
				System.out.println("3. Hotel");
				System.out.print("Opção: ");
				int criarOpcao = scanner.nextInt();
				scanner.nextLine();

				switch (criarOpcao) {
				case 1:
					// Lógica para criar um novo quarto
					// Preencha com o código apropriado
					break;
				case 2:
					// Lógica para criar um novo titular
					// Preencha com o código apropriado
					break;
				case 3:
					// Lógica para criar um novo hotel
					// Preencha com o código apropriado
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
					break;
				}
				break;
			case 2:
				// Pesquisar
				System.out.println("Escolha uma opção:");
				System.out.println("1. Quarto");
				System.out.println("2. Titular");
				System.out.println("3. Hotel");
				System.out.print("Opção: ");
				int pesquisarOpcao = scanner.nextInt();
				scanner.nextLine();

				switch (pesquisarOpcao) {
				case 1:
					// Lógica para pesquisar um quarto
					// Preencha com o código apropriado
					break;
				case 2:
					// Lógica para pesquisar um titular
					// Preencha com o código apropriado
					break;
				case 3:
					// Lógica para pesquisar um hotel
					// Preencha com o código apropriado
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
					break;
				}
				break;
			case 3:
				// Deletar
				System.out.println("Escolha uma opção:");
				System.out.println("1. Quarto");
				System.out.println("2. Titular");
				System.out.println("3. Hotel");
				System.out.print("Opção: ");
				int deletarOpcao = scanner.nextInt();
				scanner.nextLine();

				switch (deletarOpcao) {
				case 1:
					// Lógica para deletar um quarto
					// Preencha com o código apropriado
					break;
				case 2:
					// Lógica para deletar um titular
					// Preencha com o código apropriado
					break;
				case 3:
					// Lógica para deletar um hotel
					// Preencha com o código apropriado
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
					break;
				}
				break;
			case 4:
				// Lógica para exibir todos os itens cadastrados
				// Preencha com o código apropriado
				break;
			case 5:
				sair = true;
				System.out.println("Saindo do programa...");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}

			System.out.println();
		}

		scanner.close();
	}

}
