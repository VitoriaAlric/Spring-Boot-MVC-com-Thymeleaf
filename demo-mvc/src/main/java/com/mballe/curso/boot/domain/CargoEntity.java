package com.mballe.curso.boot.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "CARGOS")

public abstract class CargoEntity extends AbstractEntity<Long> {
	
	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;
	
	@ManyToOne
	@JoinColumn (name = "id_departamento_fk")
	private DepartamentoEntity departamento;
	
	@OneToMany(mappedBy = "cargo") //o lado fraco será cargo, e o lado forte funcionário, que é a tabela q tenho a chave estrangeira
	private List<FuncionarioEntity> funcionario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public DepartamentoEntity getDepartamento() {
		return departamento;
	}

	public void setDepartamento(DepartamentoEntity departamento) {
		this.departamento = departamento;
	}

	public List<FuncionarioEntity> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(List<FuncionarioEntity> funcionario) {
		this.funcionario = funcionario;
	}
	
	
}
