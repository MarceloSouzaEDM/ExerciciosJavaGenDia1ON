package com.famacia.Farmacia.produto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.famacia.Farmacia.model.ProdutoModel;
@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long>{
	public List<ProdutoModel> findAllByDescricaoProdutoContainingIgnoreCase(String DescricaoProduto);

	public List<ProdutoModel> findAllByNomeProdutoContainingIgnoreCase(String nomeProduto);

}
