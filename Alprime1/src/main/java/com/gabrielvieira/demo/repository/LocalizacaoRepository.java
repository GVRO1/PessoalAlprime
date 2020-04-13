package com.gabrielvieira.demo.repository;

import com.gabrielvieira.demo.model.Localizacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface LocalizacaoRepository extends JpaRepository<Localizacao,Integer> {
    @Query("select l from Localizacao l where l.nomeLocalizacao like ?1")
    Optional<Localizacao> findByLocalizacao(String nomeLocalizacao);
    @Query("select l from Localizacao l where l.endereco like ?1")
    Optional<Localizacao> findByEndereco(String endereco);
    @Query("select l from Localizacao l where l.tipoLinha like ?1")
    List<Localizacao> findByTipoLinha(String linha);

}

