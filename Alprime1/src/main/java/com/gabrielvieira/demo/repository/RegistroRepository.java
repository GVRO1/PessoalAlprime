package com.gabrielvieira.demo.repository;

import com.gabrielvieira.demo.model.Localizacao;
import com.gabrielvieira.demo.model.Registro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface RegistroRepository extends JpaRepository<Registro,Integer> {
    List<Registro> findByDataHoraBetween(String dataComeco, String dataFinal);
}
