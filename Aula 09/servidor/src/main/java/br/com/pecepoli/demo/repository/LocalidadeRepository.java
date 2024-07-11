package br.com.pecepoli.demo.repository;

import br.com.pecepoli.demo.domain.Localidade;
import br.com.pecepoli.demo.domain.Pacote;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;
import java.util.List

@Repository
public interface LocalidadeRepository extends JpaRepository<Localidade, UUID> {

    List<Localidade> findAllById(@Param("ids") Iterable<UUID> ids);


}
