package com.gabrielvieira.demo.repository;

import com.gabrielvieira.demo.model.Maquina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface MaquinaRepository extends JpaRepository<Maquina,Integer> {
@Query("select count(id_maquina) from Maquina ")
    Integer quantidadeMaquinas();
    
@Query("select m from Maquina m where serial_number = '1?' ")
    Optional<Maquina> maquinaSerial(String serial);
}
