package br.edu.univas.si5.bd2.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class DetalheVeiculo {
	
	@Id
	private String modelo;
	private String marca;
	private Integer ano;
	
	@OneToOne
	@JoinColumn(name="veic_fk")
	private Veiculo veiculo;
	
	@OneToMany(mappedBy= "detalheVeiculo", fetch=FetchType.LAZY)
	private Set<Revisoes> revisoes;

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

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Set<Revisoes> getRevisoes() {
		return revisoes;
	}

	public void setRevisoes(Set<Revisoes> revisoes) {
		this.revisoes = revisoes;
	}

	
	

}
