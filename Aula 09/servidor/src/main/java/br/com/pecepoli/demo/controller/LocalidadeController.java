package br.com.pecepoli.demo.controller;

import br.com.pecepoli.demo.domain.Localidade;
import br.com.pecepoli.demo.domain.Pacote;
import br.com.pecepoli.demo.service.LocalidadeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class LocalidadeController {

    private final LocalidadeService localidadeService;

    public LocalidadeController(LocalidadeService localidadeService) {
        this.localidadeService = localidadeService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/localidades")
    public ResponseEntity<List<Localidade>> getAllLocalidade(@RequestParam(name = "q", required = false) String criteria, Pageable pageable) {
        Page<Localidade> localidades = this.localidadeService.getLocalidades(criteria, pageable);
        return ResponseEntity.ok()
                .header("Access-Control-Allow-Headers", "*")
                .header("X-Total-Count", String.valueOf(localidades.getTotalElements()))
                .body(localidades.toList());
    }

    @RequestMapping(method = RequestMethod.GET, value = "/localidades/{id}")
    public ResponseEntity<Localidade> getLocalidade(@PathVariable("id")UUID id) {
        Optional<Localidade> localidade = this.localidadeService.getLocalidade(id);
        return localidade.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
