package br.com.pecepoli.demo.service;

import br.com.pecepoli.demo.domain.Localidade;
import br.com.pecepoli.demo.domain.Pacote;
import br.com.pecepoli.demo.repository.LocalidadeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class LocalidadeService {
    private final LocalidadeRepository localidadeRepository;

    public LocalidadeService(LocalidadeRepository localidadeRepository) {
        this.localidadeRepository = localidadeRepository;
    }

    public Optional<Localidade> getLocalidade (UUID id) {
        return localidadeRepository.findById(id);
    }

    public Page<Localidade> getLocalidades(String criteria, Pageable pageable) {
        Page<UUID> ids = findIds(criteria, pageable);
        List<Localidade> localidades = this.localidadeRepository.findAllById(ids.toSet());
        return new PageImpl<>(localidades, ids.getPageable(), ids.getTotalElements());
    }

    private Page<UUID> findIds(String criteria, Pageable pageable) {
        if (criteria == null) {
            return this.localidadeRepository.findIds(pageable);
        } else {
            return this.localidadeRepository.findIds("%" + criteria + "%", pageable);
        }
    }
}
