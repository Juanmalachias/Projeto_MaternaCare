package com.generation.projeto_MaternaCare.model;

import jakarta.persistence.Column;
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
public class Produtos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome_produto é Obrigatorio")
	@Size(min = 5, max = 100, message = "O atributo nome_produto deve conter no mínimo 05 e no máximo 255 caracteres")
	private String nome_produto;
	
	@NotBlank(message = "O atributo descrição é Obrigatorio")
	@Size(min = 5, max = 100, message = "O atributo descrição deve conter no mínimo 05 e no máximo 255 caracteres")
	private String descricao;
	
	@NotNull(message = "O atributo preço é Obrigatorio")
	@Column(precision = 10, scale = 2)
	private float preco;
	
	@NotBlank(message = "O atributo foto é Obrigatorio")
	@Size(min = 5, max = 100, message = "O atributo descrição deve conter no mínimo 05 e no máximo 255 caracteres")
	private String foto;
	
	
}
