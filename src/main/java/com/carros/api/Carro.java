package com.carros.api;

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
	private String descricao;
	private String url_foto;
	private String url_video;
	private String latitude;
	private String longitude;

}
