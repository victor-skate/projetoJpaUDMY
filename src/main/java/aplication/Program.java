package aplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {
	public static void main(String[]args) {
		Pessoa p1 = new Pessoa("victor","vcmboard5@gmail.com");
		Pessoa p2 = new Pessoa("igor","vcigor@gmail.com");
		Pessoa p3 = new Pessoa("natalia","nat@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();	
		
		//ABRE A TRANSA��O POSSIBILITANDO AS MANIPULA��ES NO BANCO
		em.getTransaction().begin();
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		//CONFIRMA AS ALTERA��ES REALIZADAS
		em.getTransaction().commit();
		System.out.println("pronto!");
		
		em.close();
	}
}	
