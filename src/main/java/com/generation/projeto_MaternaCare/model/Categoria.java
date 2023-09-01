package com.generation.projeto_MaternaCare.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo categoria é Obrigatorio")
	@Size(min = 5, max = 255, message = "O atributo categoria deve conter no mínimo 05 e no máximo caracteres")
	private String categoria;
	
	@NotBlank(message = "O atributo descrição é Obrigatoria")
	@Size(min = 5, max = 255, message = "O atributo descrição deve conter no mínimo 05 e no máximo caracteres")
	private String descricao;
}
