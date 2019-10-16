package br.com.danrley.fatec_ipi_mvc_spring_lista_veiculos.model.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Veiculo implements Serializable {
	@Id
	@GeneratedValue
	private long  id;
	private String modelo;
	private String marca;
	private String ano_fabricacao;
	private String cor;
	private Integer hodometro;
	private Integer lt_combustivel;
	private double autonomia;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getAno_fabricacao() {
		return ano_fabricacao;
	}
	public void setAno_fabricacao(String ano_fabricacao) {
		this.ano_fabricacao = ano_fabricacao;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Integer getHodometro() {
		return hodometro;
	}
	public void setHodometro(Integer hodometro) {
		this.hodometro = hodometro;
	}
	public Integer getLt_combustivel() {
		return lt_combustivel;
	}
	public void setLt_combustivel(Integer lt_combustivel) {
		this.lt_combustivel = lt_combustivel;
	}
	public double getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}
	
	
	
}
