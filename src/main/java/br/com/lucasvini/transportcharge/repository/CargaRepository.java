package br.com.lucasvini.transportcharge.repository;

import br.com.lucasvini.transportcharge.model.Carga;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CargaRepository extends MongoRepository<Carga, Long> {
}
