package br.edu.ifms.matricula.model.dto;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity			/*Informando que sera um registro de tabela	*/						
@Table(name = "tb_estudante")  		/*Nome da Tabela*/

public class EstudanteDto {
	@Id												/*Identificador da CLASSE*/		
	@GeneratedValue(strategy = GenerationType.AUTO)		/*ID SERA UM VALOR GERADO*/
	private UUID id;
	private String nome;
	private String cpf;
	private String email;
	private String senha;
	
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
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
