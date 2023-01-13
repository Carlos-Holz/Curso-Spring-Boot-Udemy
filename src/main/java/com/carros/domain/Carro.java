package com.carros.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
public class Carro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String tipo;
	private String nome;

}