package com.gabrielvieira.demo.repository;

import com.gabrielvieira.demo.model.Localizacao;
import com.gabrielvieira.demo.model.Maquina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedQuery;
import java.util.List;
@Repository
public interface MaquinaRepository extends JpaRepository<Maquina,Integer> {


}
