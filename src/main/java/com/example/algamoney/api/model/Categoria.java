package com.example.algamoney.api.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "categoria")
public class Categoria {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id_categoriadespesa;
		
	private Date datacadastro;
	
	private String descricao;

	
	@Override
	public int hashCode() {
		return Objects.hash(id_categoriadespesa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return id_categoriadespesa == other.id_categoriadespesa;
	}

	
	public long getId_categoriadespesa() {
		return id_categoriadespesa;
	}

	public void setId_categoriadespesa(long id_categoriadespesa) {
		this.id_categoriadespesa = id_categoriadespesa;
	}

	public Date getDataCadastro() {
		return datacadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.datacadastro = dataCadastro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
