package com.gabrielvieira.demo.service;

import com.gabrielvieira.demo.dto.MaquinaDto;
import com.gabrielvieira.demo.dto.RegistroDto;
import com.gabrielvieira.demo.model.Maquina;
import com.gabrielvieira.demo.model.Registro;
import com.gabrielvieira.demo.repository.MaquinaRepository;
import com.gabrielvieira.demo.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class RegistroService {
        @Autowired
        private MaquinaRepository maquinaRepository;
        @Autowired
        private RegistroRepository registroRepository;

        public List<RegistroDto> procurarRegistroMaquinas(Integer idMaquina){
            List<RegistroDto> registroDtos = new ArrayList<>();
            if (maquinaRepository.findById(idMaquina).isPresent()) {
                Maquina maquina = maquinaRepository.findById(idMaquina).get();
                for (Registro registro : maquina.getRegistros()) {
                    registroDtos.add(new RegistroDto(registro));
                }
            }
            return registroDtos;
        }
        public List<RegistroDto> procurarRegistroTodas(){
            List<RegistroDto> registroDtos = new ArrayList<>();
            for (Registro registro : registroRepository.findAll()) {
                registroDtos.add(new RegistroDto(registro));
            }
            return registroDtos;
        }
        public List<RegistroDto> procurarRegistroData(String dataComeco, String dataFinal){
            List<RegistroDto> registroDtos = new ArrayList<>();
            for (Registro registro : registroRepository.findByDataHoraBetween(dataComeco,dataFinal)) {
                registroDtos.add(new RegistroDto(registro));
            }
            return registroDtos;
        }

        public RegistroDto procurarRegistroId(Integer idRegistro) {
            return registroRepository.findById(idRegistro)
                    .map(RegistroDto::new)
                    .orElse(null);
        }


        public RegistroDto criarRegistro(RegistroDto registroDto){
            if (registroRepository.findById(registroDto.getId_registro()).isPresent()) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Não foi possível criar a Registro pois ela já existe!");
            }else {
                RegistroDto registroSalvo = new RegistroDto(registroRepository.save(registroDto.toEntity()));
                return  registroSalvo;
            }
        }

        public String deletarRegistro(Integer idRegistro){
            Optional<Registro> registro = registroRepository.findById(idRegistro);
            if(registro.isPresent()){
                String mensagem = String.format("Registro com o id %d foi deletado",registro.get().getIdRegistro());
                registroRepository.delete(registro.get());
                return mensagem;
            }else{
                return null;
            }
        }

        public RegistroDto atualizarRegistro(RegistroDto registroDtoAtualizado){
            registroRepository.save(registroDtoAtualizado.toEntity());
            return registroDtoAtualizado;
        }
    }
