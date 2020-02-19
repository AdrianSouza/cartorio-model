package br.com.docket.cartorio.dto.cartorio;

import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
public class CartorioDTO {

	
	private long id;

	@NotNull
	@Size(min = 5, max = 50)
	private String nome;
}
