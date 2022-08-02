package br.com.lucasvini.transportcharge.repository;

import br.com.lucasvini.transportcharge.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
