package com.example.algamoney.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.algamoney.api.model.Categoria;
import com.example.algamoney.api.model.Despesa;
import com.example.algamoney.api.repository.DespesaRepository;

@Service
public class DespesaService {

	@Autowired
	DespesaRepository despesaRepository;
	
	public Despesa create (Despesa obj) {
		return despesaRepository.save(obj);
	}
	
	public List<Despesa> findAll() {
		return despesaRepository.findAll();
	}
}
