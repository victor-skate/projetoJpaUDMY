package aplication;

import dominio.Pessoa;

public class Program {
	public static void main(String[]args) {
		Pessoa p1 = new Pessoa(1,"victor","vcmboard5@gmail.com");
		Pessoa p2 = new Pessoa(2,"igor","vcigor@gmail.com");
		Pessoa p3 = new Pessoa(3,"natalia","nat@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}	
