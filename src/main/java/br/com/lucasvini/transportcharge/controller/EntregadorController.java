package br.com.lucasvini.transportcharge.controller;

import br.com.lucasvini.transportcharge.model.Entregador;
import br.com.lucasvini.transportcharge.repository.EntregadorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/entregador")
public class EntregadorController {

    private final EntregadorRepository entregadorRepository;

    @PostMapping("/add")
    public Entregador add(@RequestBody Entregador entregador){
        return entregadorRepository.save(entregador);
    }

    @GetMapping("/list")
    public List<Entregador> listEntregador(){
        return entregadorRepository.findAll();
    }


}
