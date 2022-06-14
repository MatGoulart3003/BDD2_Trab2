package br.edu.univas.si5.bd2.entities;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Revisoes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo;
	
	private Date dataRev;
	private Float valorFinal;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="detalheVeiculo_fk")
	private DetalheVeiculo detalheVeiculo;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Date getDataRev() {
		return dataRev;
	}

	public void setDataRev(Date dataRev) {
		this.dataRev = dataRev;
	}

	public Float getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(Float valorFinal) {
		this.valorFinal = valorFinal;
	}

	public DetalheVeiculo getDetalheVeiculo() {
		return detalheVeiculo;
	}

	public void setDetalheVeiculo(DetalheVeiculo detalheVeiculo) {
		this.detalheVeiculo = detalheVeiculo;
	}
	
	
}
