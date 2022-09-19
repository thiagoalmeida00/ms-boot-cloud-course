package com.msbootcloud.hrworker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msbootcloud.hrworker.entities.Worker;
import com.msbootcloud.hrworker.repositories.WorkerRepository;

/**
 * Recurso Web para disponibilizar os endpoints
 * @author thiag
 *
 */

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

	/*Objeto que acessa o banco de dados
	 * Injeção automática de dependência */
	@Autowired
	private WorkerRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll() {
		
		/*acessa banco, instancia a lista e devolve*/
		List<Worker> list = repository.findAll();
		return ResponseEntity.ok(list);		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id) {
		
		/*.get pega o objeto dentro do Optional*/
		Worker obj = repository.findById(id).get(); 
		return ResponseEntity.ok(obj);		
	}
	
}
