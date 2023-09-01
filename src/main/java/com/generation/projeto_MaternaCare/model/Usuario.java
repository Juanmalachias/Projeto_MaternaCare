package com.generation.projeto_MaternaCare.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome_usuario é Obrigatorio")
	@Size(min = 5, max = 255, message = "O atributo nome_usuario deve conter no mínimo 05 e no máximo 255 caracteres")
	private String nome_usuario;
	
	@NotBlank(message = "O atributo email é Obrigatorio")
	@Size(min = 5, max = 255, message = "O atributo email deve conter no mínimo 05 e no máximo 255 caracteres")
	private String email;
	
	@NotBlank(message = "O atributo senha é Obrigatorio")
	@Size(min = 5, max = 255, message = "O atributo senha deve conter no mínimo 05 e no máximo 255 caracteres")
	private String senha;

	@NotBlank(message = "O atributo foto é Obrigatorio")
	@Size(min = 5, max = 255, message = "O atributo foto deve conter no mínimo 05 e no máximo 255 caracteres")
	private String foto;
}
