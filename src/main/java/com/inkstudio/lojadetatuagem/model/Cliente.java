package com.inkstudio.lojadetatuagem.model;

import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="clientes")
public class Cliente {

@Id // PK
@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto incremento do SQL SERVER
	
	private Long id;
	private String email;
	private String senha;
	private String nome;
	private String cpf;
	private String logradouro; // rua, avenida, viela
	private String cep;
	private String bairro;
	private String cidade;
	private String uf;
	private LocalDateTime dataNascimento;
	private boolean codStatusCliente;
	
	
	
	

}
