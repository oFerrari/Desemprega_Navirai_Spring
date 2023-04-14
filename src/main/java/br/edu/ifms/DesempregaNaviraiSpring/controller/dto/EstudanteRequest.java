package br.edu.ifms.DesempregaNaviraiSpring.controller.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class EstudanteRequest {
	@Size(max = 80, message = "Informe o nome completo")
	@NotBlank
	private String nome;
	
	@NotBlank
	@Size(min = 11, max = 11)
	private String cpf;
	
	@Size(max = 150, message = "Informe um endereço de e-mail")
	@NotBlank
	@Email
	private String email;
	
	@Size(max = 50, message = "Informe sua senha com ate 50 caracteres")
	@NotBlank
	private String senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
