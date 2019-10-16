package br.com.danrley.fatec_ipi_mvc_spring_lista_veiculos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.danrley.fatec_ipi_mvc_spring_lista_veiculos.model.beans.Veiculo;
import br.com.danrley.fatec_ipi_mvc_spring_lista_veiculos.services.VeiculosService;

@Controller

public class VeiculosController {
	
	@Autowired
	private VeiculosService veiculosServ;
	@GetMapping ("/veiculos")
	public ModelAndView listarVeiculos() {
		ModelAndView mav = new ModelAndView("lista_veiculos");
		
		List <Veiculo> veiculos = veiculosServ.listarTudo();
		mav.addObject("veiculos",veiculos);
		mav.addObject(new Veiculo());
		return mav;
		
	}
	
	@PostMapping
	public String salvar (Veiculo veiculo) {
	veiculosServ.salvar(veiculo);
	return "redirect:/veiculos";
	}

}
