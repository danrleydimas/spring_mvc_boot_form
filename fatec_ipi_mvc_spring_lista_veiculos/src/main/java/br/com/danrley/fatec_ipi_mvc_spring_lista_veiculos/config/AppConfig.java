package br.com.danrley.fatec_ipi_mvc_spring_lista_veiculos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import br.com.danrley.fatec_ipi_mvc_spring_lista_veiculos.interceptors.LoginInterceptor;
import br.com.danrley.fatec_ipi_mvc_spring_lista_veiculos.model.ultis.Calculadora;

@Configuration
public class AppConfig implements WebMvcConfigurer {
	
	@Bean
	public Calculadora getCalculadora () {
		return new Calculadora();
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(
				new LoginInterceptor()
		).addPathPatterns("/**").
		excludePathPatterns("/login", "/", "/fazerLogin");
	}


}
