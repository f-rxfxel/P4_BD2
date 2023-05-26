package ex2jpamaven;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {

		Cliente c1 = new Cliente(null, "c1", "c1@mail.com", "c1c1c1");
		Cliente c2 = new Cliente(null, "c2", "c2@mail.com", "c2c2c2");
		Cliente c3 = new Cliente(null, "c3", "c3@mail.com", "c3c3c3");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
//		em.getTransaction().begin();
//		em.persist(c1);
//		em.persist(c2);
//		em.persist(c3);
//		em.getTransaction().commit();
		
		Cliente c = em.find(Cliente.class, 1);
		System.out.println(c);
		
		em.getTransaction().begin();
		em.remove(c);
		em.getTransaction().commit();
		
		System.out.println(c);
		
	}

}
