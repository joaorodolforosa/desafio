package br.uam.desafio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.uam.desafio.entity.Tarefa;
import br.uam.desafio.repository.TarefaRepository;

@Service
public class TarefaService {

	@Autowired
	private TarefaRepository tarefaRepository;

	public List<Tarefa> create(Tarefa tarefa) {
		tarefaRepository.save(tarefa);
		return read();
	}

	public List<Tarefa> read() {
	    return tarefaRepository.findAll();
	}


	public List<Tarefa> update(Tarefa tarefa) {
		tarefaRepository.save(tarefa);
		return read();
		
	}

	public List<Tarefa> deleteById(Long id) {
		tarefaRepository.deleteById(id);
		return read();
	}

}
