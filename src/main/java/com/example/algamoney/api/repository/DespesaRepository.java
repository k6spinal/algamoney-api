package com.example.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.algamoney.api.model.Despesa;

public interface DespesaRepository extends JpaRepository<Despesa, Long> {

}
