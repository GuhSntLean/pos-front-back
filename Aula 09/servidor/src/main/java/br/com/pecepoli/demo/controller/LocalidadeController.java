package br.com.pecepoli.demo.controller;

import br.com.pecepoli.demo.domain.Localidade;
import br.com.pecepoli.demo.service.LocalidadeService;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class LocalidadeController {

   /* private final LocalidadeService localidadeService;

    public LocalidadeController(LocalidadeService localidadeService) {
        this.localidadeService = localidadeService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/localidade")
    public ResponseEntity<List<Localidade>> getAllLocalidade(@RequestParam(name = "q", required = false) String criteria, Pageable pageable) {
        return ResponseEntity.ok().body();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/localidade/{id}")
    public ResponseEntity<Localidade> getLocalidade(@PathVariable("id")UUID id) {

        Optional<Localidade> localidade = this.localidadeService.getLocalidade(id);
        return ResponseEntity.ok().body();
    }*/
}
