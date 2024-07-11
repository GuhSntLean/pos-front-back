package br.com.pecepoli.demo.service;

import br.com.pecepoli.demo.domain.Localidade;
import br.com.pecepoli.demo.repository.LocalidadeRepository;
import org.springframework.data.domain.Page;

import java.util.Optional;
import java.util.UUID;

public class LocalidadeService {
    private final LocalidadeRepository localidadeRepository;

    public LocalidadeService(LocalidadeRepository localidadeRepository) {
        this.localidadeRepository = localidadeRepository;
    }

    public Optional<Localidade> getLocalidade (UUID id) {
        return localidadeRepository.findById(id);
    }
}
