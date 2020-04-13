package com.gabrielvieira.demo.service;

import com.gabrielvieira.demo.dto.LocalizacaoDto;
import com.gabrielvieira.demo.model.Localizacao;
import com.gabrielvieira.demo.repository.LocalizacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LocalizacaoService {
    @Autowired
    private LocalizacaoRepository localizacaoRepository;

    public List<LocalizacaoDto> procurarLocalizacaoTodas() {
        List<LocalizacaoDto> localizacaoDtos = new ArrayList<>();
        for (Localizacao localizacao : localizacaoRepository.findAll()) {
            localizacaoDtos.add(new LocalizacaoDto(localizacao));
        }
        return localizacaoDtos;
    }

    public LocalizacaoDto procurarLocalizacaoId(Integer idLocalizacao) {
        return localizacaoRepository.findById(idLocalizacao)
                .map(LocalizacaoDto::new)
                .orElse(null);
    }

    public LocalizacaoDto procurarLocalizacaoNome(String nomeLocalizacao) {
        return localizacaoRepository.findByLocalizacao(nomeLocalizacao)
                .map(LocalizacaoDto::new)
                .orElse(null);
    }

    public List<LocalizacaoDto> procurarLocalizacaoLinha(String nomeLinha) {
        List<LocalizacaoDto> localizacaoDtos = new ArrayList<>();
        for (Localizacao localizacao : localizacaoRepository.findByTipoLinha(nomeLinha)) {
            localizacaoDtos.add(new LocalizacaoDto(localizacao));
        }
        return localizacaoDtos;
    }

    public LocalizacaoDto procurarLocalizacaoEndereco(String endereco) {
        return localizacaoRepository.findByEndereco(endereco)
                .map(LocalizacaoDto::new)
                .orElse(null);
    }

    public LocalizacaoDto criarLocalizacao(LocalizacaoDto localizacaoDto) {
        if (localizacaoRepository.findById(localizacaoDto.getId_localizacao()).isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Não foi possível criar a localização pois ela já existe!");
        } else {
            LocalizacaoDto LocalizacaoSalva = new LocalizacaoDto(localizacaoRepository.save(localizacaoDto.toEntity()));
            return LocalizacaoSalva;
        }
    }

    public String deletarLocalizacao(Integer idLocalizacao) {
        Optional<Localizacao> localizacao = localizacaoRepository.findById(idLocalizacao);
        if (localizacao.isPresent()) {
            String mensagem = String.format("Maquina com o id %d foi deletada", localizacao.get().getIdLocalizacao());
            localizacaoRepository.delete(localizacao.get());
            return mensagem;
        } else {
            return null;
        }
    }

    public LocalizacaoDto atualizarLocalizacao(LocalizacaoDto localizacaoDto) {
        localizacaoRepository.save(localizacaoDto.toEntity());
        return localizacaoDto;
    }
}

