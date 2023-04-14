package br.edu.ifms.DesempregaNaviraiSpring.model.dto;

import java.util.UUID;

public class VagaDto {
	private UUID id;
	private String cargo;
	private String descricaoVaga;
	private String tipo;
	private int quantidade;
	private double salario;
	private String requisitos;
	private String duracao;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getDescrcaoVaga() {
		return descricaoVaga;
	}
	public void setDescrcaoVaga(String descrcaoVaga) {
		this.descricaoVaga = descrcaoVaga;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getRequisitos() {
		return requisitos;
	}
	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	
}
