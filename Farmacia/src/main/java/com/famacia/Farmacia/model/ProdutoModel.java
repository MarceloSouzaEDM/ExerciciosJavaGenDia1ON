package com.famacia.Farmacia.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.famacia.Farmacia.categoria.CategoriaModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class ProdutoModel {
	@Id
	@GeneratedValue
	private long id;
	@NotNull
	@Size(min = 0 ,max = 50)
	private String nomeProduto;
	@NotNull
	@Size(min = 0 ,max = 200)
	private String descricaoProduto;
	@NotNull
	private double precoProduto;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnoreProperties("produto")
	
	private CategoriaModel categorias;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public CategoriaModel getCategoria() {
		return categorias;
	}

	public void setCategoria(CategoriaModel categoria) {
		this.categorias = categoria;
	}
	

}


