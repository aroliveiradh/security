package com.dh.securitydemo.service;

import com.dh.securitydemo.model.Produto;

import java.util.List;

public interface IProdutoService {

    Produto salvar(Produto produto);
    List<Produto> buscarTodos();
    Produto buscarPorId(Long id);
    void excluir(Long id);

}
