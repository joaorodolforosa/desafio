package br.uam.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.uam.desafio.entity.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}
