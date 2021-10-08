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
		
		//ABRE A TRANSAÇÃO POSSIBILITANDO MANIPULAÇÕES NO BANCO, PARA CONSULTAS NÃO É NECESSARIO ESSE COMANDO
		//em.getTransaction().begin();
		
		/*
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		*/
		
		/*
		//CONFIRMA AS ALTERAÇÕES REALIZADAS, É OBRIGATORIA A UTILIZAÇÃO DESSE COMANDO PARA INSERÇÃO E REMOÇÃO
		em.getTransaction().commit();
		System.out.println("pronto!");
		 */
		
		//PARA EXCLUIR UM OBJETO É NECESSARIO PRIMEIRO TRAZER OS DADOS EM UMA CONSULTA SQL
		Pessoa p = em.find(Pessoa.class,4);
		//System.out.println(p);
		
		//APÓS TRAZER OS DADOS DA CONSULTA
		em.getTransaction().begin();
		
		//SE TORNA POSSÍVEL EXCLUIR O OBJ DO BANCO
		em.remove(p);
		
		//CONFIRMA A EXCLUSÃO
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}	
