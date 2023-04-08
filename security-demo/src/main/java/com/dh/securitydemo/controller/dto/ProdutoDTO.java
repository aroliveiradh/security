package com.dh.securitydemo.controller.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDTO {

    private String nome;
    private String descricao;
    private String categoria;
    private Integer quantidade;
}
