package br.com.infinet.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infinet.model.Pacote;
import br.com.infinet.service.PacoteService;

@RestController
@RequestMapping("/pacote")
public class PacoteController {
	
	@Autowired
	PacoteService pacoteService;
	@GetMapping
	public ResponseEntity < ? > getAll(){
	 	List<Pacote> allPackages = this.pacoteService.getAll();
	 	if(allPackages.isEmpty()) return ResponseEntity.noContent().build();
	 	return ResponseEntity.ok(allPackages);
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<? > getById(@PathVariable Long id){
		Optional<Pacote> byId = this.pacoteService.getById(id);
		if(byId.isEmpty()) return ResponseEntity.noContent().build();
		return ResponseEntity.ok(byId.get());
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Pacote pacote) {
		this.pacoteService.save(pacote);
		return ResponseEntity.ok().build();
	}
}
