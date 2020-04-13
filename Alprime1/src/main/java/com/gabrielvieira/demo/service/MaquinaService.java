package com.gabrielvieira.demo.service;

import com.gabrielvieira.demo.dto.MaquinaDto;
import com.gabrielvieira.demo.model.Localizacao;
import com.gabrielvieira.demo.model.Maquina;
import com.gabrielvieira.demo.repository.LocalizacaoRepository;
import com.gabrielvieira.demo.repository.MaquinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MaquinaService {
    @Autowired
    private MaquinaRepository maquinaRepository;
    @Autowired
    private LocalizacaoRepository localizacaoRepository;

    public List<MaquinaDto> procurarMaquinaTodas(){
        List<MaquinaDto> maquinaDtos = new ArrayList<>();
        for (Maquina maquina : maquinaRepository.findAll()) {
            maquinaDtos.add(new MaquinaDto(maquina));
        }
        return maquinaDtos;
    }

    public MaquinaDto procurarMaquinaId(Integer idMaquina) {
        return maquinaRepository.findById(idMaquina)
                .map(MaquinaDto::new)
                .orElse(null);
    }

    public List<MaquinaDto> procurarMaquinaLocalizacao(String nomeLocalizacao) {
        List<MaquinaDto> maquinaDtos = new ArrayList<>();
       if(localizacaoRepository.findByLocalizacao(nomeLocalizacao).isPresent()){
           List<Maquina> maquinas = localizacaoRepository.findByLocalizacao(nomeLocalizacao).get().getMaquinas();
           for (Maquina maquina : maquinas) {
               MaquinaDto maquinaDto = new MaquinaDto(maquina);
               maquinaDtos.add(maquinaDto);
           }
       }
        return maquinaDtos;

    }

    public MaquinaDto criarMaquina(MaquinaDto maquinaDto){
        if (maquinaRepository.findById(maquinaDto.getIdMaquina()).isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Não foi possível criar a maquina pois ela já existe!");
        }else {
            MaquinaDto maquinaSalva = new MaquinaDto(maquinaRepository.save(maquinaDto.toEntity()));
            return  maquinaSalva;
        }
    }

    public String deletarMaquina(Integer idMaquina){
        Optional<Maquina> maquina = maquinaRepository.findById(idMaquina);
        if(maquina.isPresent()){
            String mensagem = String.format("Maquina com o id %d foi deletada",maquina.get().getId_maquina());
            maquinaRepository.delete(maquina.get());
            return mensagem;
        }else{
            return null;
        }
    }

    public MaquinaDto atualizarMaquina(MaquinaDto maquinaAtualizada){
        maquinaRepository.save(maquinaAtualizada.toEntity());
        return maquinaAtualizada;
    }
}
