package com.example.algamoney.api.resource;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.algamoney.api.dto.DespesaDTO;
import com.example.algamoney.api.model.Despesa;
import com.example.algamoney.api.repository.DespesaRepository;
import com.example.algamoney.api.service.DespesaService;

@RestController
@RequestMapping ("/despesas")
public class DespesaResource {

	@Autowired
	DespesaRepository despesaRepository;
	
	@Autowired
	DespesaService despesaService;
	
//	@PutMapping (value = "/{id}")
//	public ResponseEntity<Despesa> update(@PathVariable Long id, @RequestBody CategoriaDTO objDto) {
//		Categoria categoriaSalva = categoriaService.findById(id);
//		BeanUtils.copyProperties(objDto, categoriaSalva, "id");
//		categoriaRepository.save(categoriaSalva);
//		return ResponseEntity.ok(categuoriaSalva);
//	}	
	
	@PostMapping
	public ResponseEntity<Despesa> create(@RequestBody Despesa obj) {
		obj = despesaService.create(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getCategoria().getId_categoriadespesa()).toUri();
		return ResponseEntity.created(uri).build();
	}	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Despesa> findById(@PathVariable Long id) {
		Despesa obj = despesaService.findById(id);
		return ResponseEntity.ok().body(obj);
	}	
	
	@GetMapping
	public ResponseEntity<List<DespesaDTO>> findAll() {
		List<Despesa> list = despesaService.findAll();
		List<DespesaDTO> listDTO = list.stream().map(obj -> new DespesaDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}	
	
	
}
