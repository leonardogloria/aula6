package br.com.infinet.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
	
	@Value("${server.id}")
    private String serverId;
	@Autowired
	PacoteService pacoteService;
	@GetMapping
	public ResponseEntity < ? > getAll(){
		System.out.println("server id: " + serverId);
		return ResponseEntity.ok().build();
	
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<? > getById(@PathVariable Long id){
		System.out.println("server id: " + serverId);
		return ResponseEntity.ok().build();

	
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Pacote pacote) {
		System.out.println("server id: " + serverId);

		return ResponseEntity.ok().build();
	}
}
