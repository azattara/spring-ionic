package com.dpdnti.uema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dpdnti.uema.domain.Produto;

@Repository
public interface  ProdutoRepository extends JpaRepository<Produto, Integer>{

}
