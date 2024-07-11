package br.com.pecepoli.demo.service;

import br.com.pecepoli.demo.repository.LocalidadeRepository;

public class LocalidadeService {
    private final LocalidadeRepository localidadeRepository;

    public LocalidadeService(LocalidadeRepository localidadeRepository) {
        this.localidadeRepository = localidadeRepository;
    }
}
