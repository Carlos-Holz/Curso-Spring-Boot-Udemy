package com.carros.api;

import org.modelmapper.ModelMapper;

import lombok.Data;

@Data
public class CarroDTO {
	private Long id;
	private String tipo;
	private String nome;

	public static CarroDTO create(Carro carro) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(carro, CarroDTO.class);

	}
}
