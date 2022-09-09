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
	private Long id_categoria;
	
	public DespesaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DespesaDTO(Despesa obj, Long id) {
		super();
		this.id = obj.getId_despesa();
		this.descricao = obj.getDescricao();
		this.datacadastro = obj.getDatacadastro();
		this.id_categoria = obj.getCategoria().getId_categoriadespesa();
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

	public Long getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Long id_categoria) {
		this.id_categoria = id_categoria;
	}


	
}
