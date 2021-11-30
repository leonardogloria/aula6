package br.com.infinet.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.infinet.model.Pacote;

@Repository
public interface PacotesRepository extends CrudRepository<Pacote, Long> {

}
