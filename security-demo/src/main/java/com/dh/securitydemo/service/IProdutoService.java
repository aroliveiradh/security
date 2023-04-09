package com.dh.securitydemo.service;

import com.dh.securitydemo.model.dto.ProdutoDTO;
import com.dh.securitydemo.model.Produto;

import java.util.List;

public interface IProdutoService {

    ProdutoDTO salvar(Produto produto);
    List<ProdutoDTO> buscarTodos();
    ProdutoDTO buscarPorId(Long id);
    void excluir(Long id);

}
