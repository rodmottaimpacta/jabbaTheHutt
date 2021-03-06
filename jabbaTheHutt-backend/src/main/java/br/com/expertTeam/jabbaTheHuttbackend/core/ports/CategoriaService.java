package br.com.expertTeam.jabbaTheHuttbackend.core.ports;

import br.com.expertTeam.jabbaTheHuttbackend.core.entities.Categoria;

import java.util.List;

public interface CategoriaService {
    Categoria salvar(Categoria categoria);
    Categoria buscarPorId(Long id);
    List<Categoria> buscarTodos();
    Categoria atualizar(Long id, Categoria categoria);
    void deletar(Long id);
}
