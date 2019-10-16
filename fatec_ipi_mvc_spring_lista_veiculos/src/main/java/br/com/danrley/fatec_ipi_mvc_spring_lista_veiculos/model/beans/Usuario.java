package br.com.danrley.fatec_ipi_mvc_spring_lista_veiculos.model.beans;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity

public class Usuario implements Serializable  {


	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private long id;
	
	private String login;
	private String senha;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
