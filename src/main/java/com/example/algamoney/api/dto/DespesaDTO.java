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
		
		System.out.println("*** ID: "+obj.getId_despesa());
		this.id = obj.getId_despesa();
		
		System.out.println("*** Descrição: "+obj.getDescricao());
		this.descricao = obj.getDescricao();
		
		System.out.println("*** DataCadastro: "+obj.getDatacadastro());
		this.datacadastro = obj.getDatacadastro();
		
		System.out.println("*** id_categoria: "+obj.getCategoria().getId_categoriadespesa());
		
		System.out.println("*** Categoria ID: "+obj.getCategoria().getId_categoriadespesa());
		this.id_categoria = obj.getCategoria().getId_categoriadespesa();
//		this.setCategoria_id(obj.getCategoria().getId_categoriadespesa());
		
		System.out.println("*** ID: "+id);
		
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
