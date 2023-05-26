package p4.bd2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

//		em.getTransaction().begin();
//		em.persist(t1);
//		em.persist(t2);
//		em.persist(t3);
//		em.getTransaction().commit();
//		em.getTransaction().begin();
//		em.remove(obj);
//		em.getTransaction().commit();

		Scanner scanner = new Scanner(System.in);
		boolean sair = false;

		while (!sair) {
			System.out.println("===== HOTÉIS =====");
			System.out.println("1. Criar hotel");
			System.out.println("2. Encontrar hotel");
			System.out.println("3. Apagar hotel");
			System.out.println("4. Sair");
			System.out.print("Escolha uma opção: ");

			int opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			// CRIAR
			case 1:
				em.getTransaction().begin();

				System.out.print("Digite o CNPJ do hotel: ");
				String cnpj = scanner.nextLine();
				System.out.print("Digite a quantidade de prédios: ");
				int predios = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Digite o telefone: ");
				String telefone = scanner.nextLine();

				Hotel h = new Hotel(cnpj, predios, telefone);
				em.persist(h);
				em.getTransaction().commit();
				System.out.println("Hotel criado com sucesso!");
				break;
			// PESQUISAR
			case 2:

				System.out.print("Digite o CNPJ do Hotel: ");
				String findCnpj = scanner.nextLine();
				Hotel hotelEncontrado = em.find(Hotel.class, findCnpj);
				System.out.println(hotelEncontrado.toString());
				break;
			// APAGAR
			case 3:
				em.getTransaction().begin();

				System.out.print("Digite o CNPJ do Hotel: ");
				String removeCnpj = scanner.nextLine();
				Hotel removeHotel = em.find(Hotel.class, removeCnpj);
				em.remove(removeHotel);
				em.getTransaction().commit();
				System.out.println("Hotel removido com sucesso!");
				break;
			case 4:
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
