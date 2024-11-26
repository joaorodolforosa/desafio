package br.uam.desafio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.uam.desafio.entity.Tarefa;
import br.uam.desafio.service.TarefaService;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
	
	@Autowired
	private TarefaService tarefaService;
	
	@PostMapping
	List<Tarefa> create(@RequestBody Tarefa tarefa) {
		return tarefaService.create(tarefa);
	}
	
	@GetMapping
	List<Tarefa> read() {
		return tarefaService.read();		
	}
	
	@PutMapping
	List<Tarefa> update(@RequestBody Tarefa tarefa) {
		return tarefaService.update(tarefa);
		
	}
	
	@DeleteMapping("{id}")
	List<Tarefa> deleteById(@PathVariable("id") Long id) {
		return tarefaService.deleteById(id);
		
	}

}
