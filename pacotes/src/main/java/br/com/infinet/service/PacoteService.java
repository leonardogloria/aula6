package br.com.infinet.service;

import java.util.List;
import java.util.Optional;

import br.com.infinet.model.Pacote;


public interface PacoteService {
	List<Pacote> getAll();
	void save(Pacote p);
	Optional<Pacote> getById(Long id);
}
