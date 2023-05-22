package p4.bd2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {

		Titular t1 = new Titular(111, "Titular1", "ttlr1@mail.com", "end1", "11111");
		Titular t2 = new Titular(222, "Titular2", "ttlr2@mail.com", "end2", "22222");
		Titular t3 = new Titular(333, "Titular3", "ttlr3@mail.com", "end3", "33333");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(t1);
		em.persist(t2);
		em.persist(t3);
		em.getTransaction().commit();
		
//		Titular t = em.find(Titular.class, 111); // Encontrando Titular de CPF "111".
//		Titular t2 = em.find(Titular.class, 222); // Encontrando Titular de CPF "111".
//		Titular t3 = em.find(Titular.class, 333); // Encontrando Titular de CPF "111".
		
//		em.getTransaction().begin();
//		em.remove(t1);
//		em.getTransaction().commit();
		
//		System.out.println(t);
		
	}

}
