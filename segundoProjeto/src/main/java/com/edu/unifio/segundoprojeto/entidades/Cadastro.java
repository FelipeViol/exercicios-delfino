package com.edu.unifio.segundoprojeto.entidades;

import lombok.Data;

import java.time.LocalDate;
@Data
public class Cadastro {
    private Integer codigo;
    private String nome;
    private Double cpf;
    private LocalDate datanasc;
    private String rua;
    private Integer numero;
    private String bairro;
    private String cidade;
    private String uf;
    private Integer cep;
    private String complemento;
}
