package com.example.algamoney.api.dto;

import java.io.Serializable;
import java.util.Date;

import com.example.algamoney.api.model.Categoria;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoriaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String descricao;
	private Date datacadastro;
	
	public CategoriaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CategoriaDTO(Categoria obj) {
		super();
		System.out.println("*** ID: "+obj.getId_categoriadespesa());
		this.id = obj.getId_categoriadespesa();
		System.out.println("*** Descrição: "+obj.getDescricao());
		this.descricao = obj.getDescricao();
		System.out.println("*** DataCadastro: "+obj.getDataCadastro());
		this.datacadastro = obj.getDataCadastro();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDatacadastro() {
		return datacadastro;
	}

	public void setDatacadastro(Date datacadastro) {
		this.datacadastro = datacadastro;
	}
	
	
	
	
	
	
}
