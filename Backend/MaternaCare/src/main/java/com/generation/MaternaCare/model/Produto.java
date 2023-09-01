package com.generation.MaternaCare.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome_produto é Obrigatorio")
	@Size(min = 5, max = 100, message = "O atributo nome_produto deve conter no mínimo 05 e no máximo 255 caracteres")
	private String nome_produto;
	
	@NotBlank(message = "O atributo descrição é Obrigatorio")
	@Size(min = 5, max = 255, message = "O atributo descrição deve conter no mínimo 05 e no máximo 255 caracteres")
	private String descricao;
	
	@NotNull(message = "O atributo preço é Obrigatorio")
	private float preco;
	
	@NotBlank(message = "O atributo foto é Obrigatorio")
	private String foto;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
}
