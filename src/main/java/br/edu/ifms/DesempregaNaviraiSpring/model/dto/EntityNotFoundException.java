package br.edu.ifms.DesempregaNaviraiSpring.model.dto;

public class EntityNotFoundException extends RuntimeException{
	public EntityNotFoundException() {
		super("Entidade não encontrada");
	}
	
	public EntityNotFoundException(String message) {
		super(message);
	}
}
