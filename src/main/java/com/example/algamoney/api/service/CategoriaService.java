package com.example.algamoney.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.algamoney.api.dto.CategoriaDTO;
import com.example.algamoney.api.model.Categoria;
import com.example.algamoney.api.repository.CategoriaRepository;
import com.example.algamoney.exception.*;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria findById(Long id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: "+id + ", Tipo: " + Categoria.class.getName()));
	}
	
	public List<Categoria> findAll() {
		return categoriaRepository.findAll();
	}
	
	public Categoria create(Categoria obj) {
		return categoriaRepository.save(obj);
	}

	public Categoria update(Long id, CategoriaDTO objDto) {
		Categoria obj = findById(id);
		obj.setDescricao(objDto.getDescricao());
		obj.setId_categoriadespesa(objDto.getId());
		obj.setDataCadastro(objDto.getDatacadastro());
		return categoriaRepository.save(obj);
	}

//	public Categoria update(Long id, Categoria obj) {
//		Categoria categoriaSalvar = findById(id);
//		obj.setDescricao(categoriaSalvar.getDescricao());
//		obj.setId_categoriadespesa(categoriaSalvar.getId_categoriadespesa());
//		obj.setDataCadastro(categoriaSalvar.getDataCadastro());
//		return categoriaRepository.save(obj);
//	}	
	
	public void delete(Long id) {
		findById(id);
		try {
			categoriaRepository.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException("Objeto não pode ser deletado. Possui itens associados.");
		}
			
	}
}
