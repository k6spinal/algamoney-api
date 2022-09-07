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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.algamoney.api.dto.DespesaDTO;
import com.example.algamoney.api.model.Categoria;
import com.example.algamoney.api.model.Despesa;
import com.example.algamoney.api.repository.DespesaRepository;
import com.example.algamoney.api.service.CategoriaService;
import com.example.algamoney.api.service.DespesaService;

@RestController
@RequestMapping ("/despesas")
public class DespesaResource {

	@Autowired
	DespesaRepository despesaRepository;
	
	@Autowired
	DespesaService despesaService;
	
	@Autowired
	CategoriaService categoriaService;
	
//	@PutMapping (value = "/{id}")
//	public ResponseEntity<Despesa> update(@PathVariable Long id, @RequestBody CategoriaDTO objDto) {
//		Categoria categoriaSalva = categoriaService.findById(id);
//		BeanUtils.copyProperties(objDto, categoriaSalva, "id");
//		categoriaRepository.save(categoriaSalva);
//		return ResponseEntity.ok(categuoriaSalva);
//	}	
	
//	@PostMapping
//	public ResponseEntity<Despesa> create(@RequestBody Despesa obj, Long id_categoria) {
//		System.out.println("*** id_categoria: "+id_categoria);
//		obj = despesaService.create(obj);
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId_despesa()).toUri();
//		return ResponseEntity.created(uri).build();
//	}
	
	@PostMapping
	public ResponseEntity<Despesa> create(@RequestBody DespesaDTO obj) {
		Despesa despesa = new Despesa();
		despesa.setDescricao(obj.getDescricao());
		despesa.setDatacadastro(obj.getDatacadastro());
		Categoria categoria = new Categoria();
		categoria = categoriaService.findById(obj.getId_categoria());
		despesa.setCategoria(categoria);
		despesa = despesaService.create(despesa);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(despesa.getId_despesa()).toUri();
		return ResponseEntity.created(uri).build();
	}		
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Despesa> findById(@PathVariable Long id) {
		Despesa obj = despesaService.findById(id);
		return ResponseEntity.ok().body(obj);
	}	
	
//	@GetMapping
//	public ResponseEntity<List<DespesaDTO>> findAll() {
//		List<Despesa> list = despesaService.findAll();
//		List<DespesaDTO> listDTO = list.stream().map(obj -> new DespesaDTO(obj, null)).collect(Collectors.toList());
//		return ResponseEntity.ok().body(listDTO);
//	}	
	
	@GetMapping
	public ResponseEntity<List<DespesaDTO>> findAll(@RequestParam(value = "categoria", defaultValue = "0") Long id_cat) {
		List<Despesa> list = despesaService.findAll(id_cat);
		List<DespesaDTO> listDTO = list.stream().map(obj -> new DespesaDTO(obj, null)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	
}
