package br.com.infinet.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infinet.model.Pacote;
import br.com.infinet.repository.PacotesRepository;
import br.com.infinet.service.PacoteService;

@Service
public class PacoteServiceImpl implements PacoteService  {
	@Autowired
	PacotesRepository pacotesRepository;
	@Override
	public List<Pacote> getAll() {
		return (List<Pacote>) this.pacotesRepository.findAll();

	}

	@Override
	public void save(Pacote p) {
		this.pacotesRepository.save(p);
		
	}

	@Override
	public Optional<Pacote> getById(Long id) {
		return this.pacotesRepository.findById(id);
	}

}
