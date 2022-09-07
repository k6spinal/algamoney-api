package com.example.algamoney.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.algamoney.api.model.Despesa;
import com.example.algamoney.api.repository.DespesaRepository;
import com.example.algamoney.exception.ObjectNotFoundException;

@Service
public class DespesaService {

	@Autowired
	DespesaRepository despesaRepository;
	
	@Autowired
	CategoriaService categoriaService;
	
	public Despesa create (Despesa obj) {
		return despesaRepository.save(obj);
	}
	
	public List<Despesa> findAll() {
		return despesaRepository.findAll();
	}
	
	public Despesa findById(Long id) {
		Optional<Despesa> obj = despesaRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: "+id + "Tipo: " + Despesa.class.getName()));
	}
	
	public Despesa findByIdCategoria(Long id) {
		Optional<Despesa> obj = despesaRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: "+id + "Tipo: " + Despesa.class.getName()));
	}
	
	public List<Despesa> findAll(Long id_cat) {
		categoriaService.findById(id_cat);
		return despesaRepository.findAllByCategoria(id_cat);
	}
	
	
}
