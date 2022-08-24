package com.example.algamoney.api.dto;

import java.io.Serializable;
import java.util.Date;

import com.example.algamoney.api.model.Despesa;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DespesaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String descricao;
	private Date datacadastro;
	
	public DespesaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DespesaDTO(Despesa obj) {
		super();
		System.out.println("*** ID: "+obj.getId_despesa());
		this.id = obj.getId_despesa();
		System.out.println("*** Descrição: "+obj.getDescricao());
		this.descricao = obj.getDescricao();
		System.out.println("*** DataCadastro: "+obj.getDatacadastro());
		this.datacadastro = obj.getDatacadastro();
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
