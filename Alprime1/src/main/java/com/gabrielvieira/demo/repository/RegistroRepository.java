package com.gabrielvieira.demo.repository;

import com.gabrielvieira.demo.model.Registro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RegistroRepository extends JpaRepository<Registro,Integer> {
//    List<Registro> findByData_horaBetween(String dataComeco, String dataFinal);
@Query("select count(id_registro) from Registro ")
    Integer quantidadeRegistros();
//@Query("select r from registro r where fk_maquina = 1?")
//    List<Registro> registroMaquina(Integer idMaquina);
}
