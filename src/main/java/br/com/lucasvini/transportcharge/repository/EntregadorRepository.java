package br.com.lucasvini.transportcharge.repository;

import br.com.lucasvini.transportcharge.model.Entregador;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EntregadorRepository extends MongoRepository<Entregador, Long> {
}
