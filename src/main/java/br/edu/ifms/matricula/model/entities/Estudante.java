package br.edu.ifms.matricula.model.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity			/*Informando que sera um registro de tabela	*/						
@Table(name = "tb_estudante")  		/*Nome da Tabela*/
public class Estudante {

	@Id												/*Identificador da CLASSE*/		
	@GeneratedValue(strategy = GenerationType.AUTO)		/*ID SERA UM VALOR GERADO*/
	private UUID id;
	
	@Column(nullable = false,length = 80)						/*NotNull*/
	private String nome;
	
	@Column(nullable = false,length = 11)
	private String cpf;
	
	@Column(nullable = false,length = 50)
	private String email;
	
	@Column(nullable = false,length = 50)
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
