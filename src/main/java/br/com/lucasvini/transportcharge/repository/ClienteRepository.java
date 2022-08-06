package br.com.lucasvini.transportcharge.repository;

import br.com.lucasvini.transportcharge.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, Long> {
}
