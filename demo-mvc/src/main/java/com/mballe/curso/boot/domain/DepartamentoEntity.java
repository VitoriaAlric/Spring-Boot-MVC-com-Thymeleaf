package com.mballe.curso.boot.domain;

import java.util.List;

import javax.persistence.*;

/*extendendo a classe abstract entity, e definindo o tipo genérico como Long, 
 ou seja, o Id dessa classe será herdado omo um tipo Long*/

@Entity // transforma essa entidade, em uma entidade gerenciada pela JPA
@Table(name = "DEPARTAMENTOS")
public class DepartamentoEntity extends AbstractEntity<Long> {

	@Column(name = "nome", nullable = false, unique = true, length = 60)    /*mapeando o atributo nome, dizendo que essa
																			 coluna é obrigatoria setado com o
																			 nullable (como false), dizendo qu eé
																			 unica com o unique, e o tamanho dela com
																			 60 caracters. */
	private String nome;

	@OneToMany(mappedBy = "departamento") //muitos cargos para 1 departamento, mappedBy é necessario pois o relacionamento de departamento e cargo será biderecional, nesses casos é necessario dizer qual é o lado forte e qual é o lado fraco da relação, o lado forte é o lado qu contém a chave estrangeira
	private List<CargoEntity> cargos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<CargoEntity> getCargos() {
		return cargos;
	}

	public void setCargos(List<CargoEntity> cargos) {
		this.cargos = cargos;
	}
	

}
