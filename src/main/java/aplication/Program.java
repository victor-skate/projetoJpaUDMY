package aplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {
	public static void main(String[]args) {
		/*
		Pessoa p1 = new Pessoa("victor","vcmboard5@gmail.com");
		Pessoa p2 = new Pessoa("igor","vcigor@gmail.com");
		Pessoa p3 = new Pessoa("natalia","nat@gmail.com");
		*/
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();	
		
		//ABRE A TRANSA��O POSSIBILITANDO MANIPULA��ES NO BANCO, PARA CONSULTAS N�O � NECESSARIO ESSE COMANDO
		//em.getTransaction().begin();
		
		/*
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		*/
		
		/*
		//CONFIRMA AS ALTERA��ES REALIZADAS, � OBRIGATORIA A UTILIZA��O DESSE COMANDO PARA INSER��O E REMO��O
		em.getTransaction().commit();
		System.out.println("pronto!");
		 */
		
		//PARA EXCLUIR UM OBJETO � NECESSARIO PRIMEIRO TRAZER OS DADOS EM UMA CONSULTA SQL
		Pessoa p = em.find(Pessoa.class,4);
		//System.out.println(p);
		
		//AP�S TRAZER OS DADOS DA CONSULTA
		em.getTransaction().begin();
		
		//SE TORNA POSS�VEL EXCLUIR O OBJ DO BANCO
		em.remove(p);
		
		//CONFIRMA A EXCLUS�O
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}	
