package netJavamodel;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Usuario {
	@Id 
	@GeneratedValue
	private long id ;
	
	
	@Column(name = "primeiro-nome")
	private String nome ;
	
	@Column(name = "segundo-nome")
	private String email;
	
	public Usuario( String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	
	public Usuario() {
		// TODO Auto-generated constructor stub

	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


}
