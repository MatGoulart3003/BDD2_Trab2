package br.edu.univas.si5.bd2.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idVeiculo;
	private String proprietario;
	private String senha_prop;
	
	@OneToOne(mappedBy = "veiculo")
	private DetalheVeiculo detalheVeiculo;

	public Integer getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(Integer idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getSenha_prop() {
		return senha_prop;
	}

	public void setSenha_prop(String senha_prop) {
		this.senha_prop = senha_prop;
	}

	public DetalheVeiculo getDetalheVeiculo() {
		return detalheVeiculo;
	}

	public void setDetalheVeiculo(DetalheVeiculo detalheVeiculo) {
		this.detalheVeiculo = detalheVeiculo;
	}
	
	
	
}
