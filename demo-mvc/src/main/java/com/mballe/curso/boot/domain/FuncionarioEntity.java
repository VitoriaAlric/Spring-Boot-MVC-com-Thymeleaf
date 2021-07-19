package com.mballe.curso.boot.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "FUNCIONARIOS")
public abstract class FuncionarioEntity extends AbstractEntity<Long> {

	@Column(nullable = false, unique = true)
	private String nome;

	@Column(nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00") // columDefintion serve para definir o
																				// tipo de dados que teremos no banco de
																				// dados, nesse caso o tupo DECIMAL, com
																				// duas casas depois da virgula e o
																				// padrão default, para caso não tneha
																				// salário fique como 0.00 ao invés de
																				// Null
	private BigDecimal salario;

	@Column(name = "data_entrada", nullable = false, columnDefinition = "DATE")
	private LocalDate dataEntrada;

	@Column(name = "data_saida", columnDefinition = "DATE")
	private LocalDate dataSaida;

	@OneToOne(cascade = CascadeType.ALL) // quando for inserir um funcionarios, será inserido por cascada o endereço
											// também, o mesmo para quando editar e deletar.
	@JoinColumn(name = "endereco_id_fk") // nomear a chave estrangeiro na tabela de funcionarios
	private EnderecoEntity endereco;

	@ManyToOne
	@JoinColumn(name = "cargo_id_fk")
	private String cargo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public LocalDate getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}

	public EnderecoEntity getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoEntity endereco) {
		this.endereco = endereco;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
