package br.com.danrley.fatec_ipi_mvc_spring_lista_veiculos.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.danrley.fatec_ipi_mvc_spring_lista_veiculos.model.beans.Usuario;

public interface UsuariosRepository extends JpaRepository<Usuario , Long> {
	
	public Usuario findOneByLoginAndSenha (String login, String senha);

}
