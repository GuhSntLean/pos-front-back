package br.com.pecepoli.demo.controller;


import br.com.pecepoli.demo.domain.Pacote;
import br.com.pecepoli.demo.repository.PacoteRepository;
import br.com.pecepoli.demo.service.PacoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

@RestController
public class PacoteController {
    @Autowired
    private PacoteRepository repository;

    private final PacoteService pacoteService;

    public PacoteController(PacoteService pacoteService) {
        this.pacoteService = pacoteService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/pacotes")
    public List<Pacote> obterTodos(@RequestParam(required = false, name = "q") String desc) {
        if(Objects.isNull(desc) || desc.isBlank()){
            return this.pacoteService.obterPacotes();
        }
        else{
            return this.pacoteService.obterPacotesBy(desc);
        }
    }
}
