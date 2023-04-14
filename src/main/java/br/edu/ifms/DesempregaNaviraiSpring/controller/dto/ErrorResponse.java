package br.edu.ifms.DesempregaNaviraiSpring.controller.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ErrorResponse implements Serializable{
	private static final long serialVersionUID = 1L;
	private Instant timestamp = Instant.now();
	private Integer status;
	private String error;
	private String path;
	private String message;
	
	private List<String> details = new ArrayList<>();
	
	public void addDetail(String detail) {
		details.add(detail);
	}
}
