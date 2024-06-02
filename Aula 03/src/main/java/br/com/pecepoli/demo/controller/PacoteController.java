package br.com.pecepoli.demo.controller;

import br.com.pecepoli.demo.domain.Pacote;
import br.com.pecepoli.demo.repository.PacoteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PacoteController {
    private final PacoteRepository pacoteRepository;

    public PacoteController(PacoteRepository pacoteRepository) {
        this.pacoteRepository = pacoteRepository;
    }

    @GetMapping(path = "/pacotes")
    public List<Pacote> obterTodos() {
        return pacoteRepository.obterTodos();
    }
}
