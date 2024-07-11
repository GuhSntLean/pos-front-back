package br.com.pecepoli.demo.controller;

import br.com.pecepoli.demo.domain.Localidade;
import br.com.pecepoli.demo.service.LocalidadeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocalidadeController {

    private final LocalidadeService localidadeService;

    public LocalidadeController(LocalidadeService localidadeService) {
        this.localidadeService = localidadeService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/localidade")
    public ResponseEntity<List<Localidade>> listAllLocalidade() {
        return ResponseEntity.ok().body();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/localidade/{id}")
    public ResponseEntity<Localidade> getLocalidade() {
        return ResponseEntity.ok().body();
    }
}
