package com.mballe.curso.boot.domain;

import java.io.Serializable;

import javax.persistence.*;

/*
 Adicionei um tipo genérico na assinatura AbstractEntity,  para forçar
 as classes filhas a dizerem qual tipo de dados elas vão utilizar como chaves primarias. 
 */

@SuppressWarnings("serial")
@MappedSuperclass // Diz para o JPA que essa é uma suerclass das demais que foram criadas.
public abstract class AbstractEntity<ID extends Serializable> implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // o tipo identity é o tipo referetente ao auto incremento do mysql
														

	private ID id;

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractEntity other = (AbstractEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "id =" + id;
	}

}
