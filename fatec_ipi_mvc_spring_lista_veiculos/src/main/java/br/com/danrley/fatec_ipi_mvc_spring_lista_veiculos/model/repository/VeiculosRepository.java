package br.com.danrley.fatec_ipi_mvc_spring_lista_veiculos.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.danrley.fatec_ipi_mvc_spring_lista_veiculos.model.beans.Veiculo;

public interface VeiculosRepository extends JpaRepository<Veiculo, Long>{
	
	

}
