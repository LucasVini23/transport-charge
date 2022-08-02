package br.com.lucasvini.transportcharge.controller;

import br.com.lucasvini.transportcharge.model.Cliente;
import br.com.lucasvini.transportcharge.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/client")
public class ClienteController {

    private final ClienteRepository repository;

    @PostMapping("/add")
    public Cliente addClient(@RequestBody Cliente client) {
        return repository.save(client);
    }

    @GetMapping("/list")
    public List<Cliente> listClient() {
        return repository.findAll();
    }

}
