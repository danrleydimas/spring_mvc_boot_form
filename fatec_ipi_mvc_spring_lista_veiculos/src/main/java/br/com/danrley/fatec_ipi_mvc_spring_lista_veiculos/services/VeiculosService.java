package br.com.danrley.fatec_ipi_mvc_spring_lista_veiculos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.danrley.fatec_ipi_mvc_spring_lista_veiculos.model.beans.Veiculo;
import br.com.danrley.fatec_ipi_mvc_spring_lista_veiculos.model.repository.VeiculosRepository;
import br.com.danrley.fatec_ipi_mvc_spring_lista_veiculos.model.ultis.Calculadora;

@Service
public class VeiculosService {
	@Autowired
	
	private VeiculosRepository veiculosRep;
	@Autowired
	private Calculadora calculadora;
	
	
	public void salvar(Veiculo veiculo) {
		veiculosRep.save(veiculo);
		
		
		
	}
	
	public List <Veiculo> listarTudo(){
		List <Veiculo> veiculos = veiculosRep.findAll();
		for (Veiculo veiculo : veiculos) {
				veiculo.setAutonomia(calculadora.calcularAutonomia(veiculo.getHodometro(),
				veiculo.getLt_combustivel()));
		}
		return veiculos;
	}
	
	
}
