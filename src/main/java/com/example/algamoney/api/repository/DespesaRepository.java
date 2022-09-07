package com.example.algamoney.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.algamoney.api.model.Despesa;

public interface DespesaRepository extends JpaRepository<Despesa, Long> {

	@Query("SELECT obj from Despesa obj WHERE obj.categoria.id_categoriadespesa = :id_cat")
	List<Despesa> findAllByCategoria(@Param(value = "id_cat") Long id_cat);

}
