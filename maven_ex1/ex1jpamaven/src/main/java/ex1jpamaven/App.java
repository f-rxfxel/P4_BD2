package ex1jpamaven;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
//		Produto p1 = new Produto(null, "Produto 1", 1);
//		Produto p2 = new Produto(null, "Produto 2", 2);
//		Produto p3 = new Produto(null, "Produto 3", 3);
		
		//Instanciar o EntityManagerFactory e o EntityManager conforme abaixo:
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//Utiize o método persist para persistir os objetos conforme abaixo:
//		em.getTransaction().begin();
//		
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		
//		em.getTransaction().commit();
//		//getTransaction().begin() inicia a transação com o banco e o .commit() confirma a persistência.
//		
//		System.out.println("Que a forca esteja com vc");
	
		//consultar dados
		Produto p = em.find(Produto.class, 1);
		System.out.println(p);
		
		//deletar dados
		// begin e remove sao usados aqui pois sao feitas alteraçoes no banco
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();;
		
		em.close();
		emf.close();
	}

}
