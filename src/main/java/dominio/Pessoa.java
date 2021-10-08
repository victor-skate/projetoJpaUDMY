package dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa implements Serializable{
	private static final long serialVersionUID= 1l;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	/*RENOMEA O NOME DA COLUNA NO BANCO DE DADOS*/
	@Column(name="nome")
	private String name;
	
	private String email;
	
	public Pessoa() {
		
	}

	public Pessoa(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
	
	
	
}
