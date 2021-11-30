package br.com.infinet.controller;

import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.infinet.model.Pacote;

@RestController
@RequestMapping("/home")
public class HomeController {
	@Autowired
	RestTemplate restTemplate;
	@GetMapping("/{id}")
	public void getPacoteById(@PathVariable Long id) {
		Pacote forObject2 = restTemplate.getForObject("http://PACOTES/pacote/" + id, Pacote.class);
		System.out.println(forObject2);
		
		
	}
	@GetMapping
	public void list() {
		ResponseEntity<Pacote[]> forEntity = restTemplate.getForEntity("http://PACOTES/pacote", Pacote[].class);
		Pacote[] body = forEntity.getBody();
		List<Pacote> asList = Arrays.asList(body);
		System.out.println(asList);
	}
	@GetMapping( "/create")
	public void post() {
		Pacote pacote = Pacote.builder().destino("Europa Completa").preco( 160000D).build();
		
		HttpEntity<Pacote> httpEntity = new HttpEntity<>(pacote);
		//URI postForLocation = restTemplate.postForLocation("http://localhost:8080/pacote/", httpEntity);
		ResponseEntity<Pacote> exchange = restTemplate.exchange("http://PACOTES/pacote/", HttpMethod.POST, httpEntity, Pacote.class);
		System.out.println(exchange.getStatusCode());
		
		
		
	

	}
		
}
