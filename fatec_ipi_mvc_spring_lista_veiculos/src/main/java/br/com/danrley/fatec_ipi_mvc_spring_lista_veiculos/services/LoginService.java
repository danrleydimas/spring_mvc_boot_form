package br.com.danrley.fatec_ipi_mvc_spring_lista_veiculos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.danrley.fatec_ipi_mvc_spring_lista_veiculos.model.beans.Usuario;
import br.com.danrley.fatec_ipi_mvc_spring_lista_veiculos.model.repository.UsuariosRepository;

@Service

public class LoginService {
	@Autowired
	UsuariosRepository usuarioRepo;
	public boolean logar (Usuario usuario) {
	return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(),
	usuario.getSenha()) != null;
	}

}
