package com.famacia.Farmacia.categoria;
	
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.famacia.Farmacia.model.ProdutoModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class CategoriaModel {
	@Id
	@GeneratedValue
	private long id;
	@NotNull
	@Size(min = 0 ,max = 50)
	private String nomeCategoria;
		
	@NotNull
	@Size(min = 0 ,max = 500)
	private String descricaoCategoria;
	
	@OneToMany(mappedBy = "categorias")
	@JsonIgnoreProperties("categoria")
	
	private List<ProdutoModel> produto;
	
	public List<ProdutoModel> getProduto() {
		return produto;
	}
	public void setProduto(List<ProdutoModel> produto) {
		this.produto = produto;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeCategoria() {
		return nomeCategoria;
	}
	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}
	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}
	
	
	
	

}
