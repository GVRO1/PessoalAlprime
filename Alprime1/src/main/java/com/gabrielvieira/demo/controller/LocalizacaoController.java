package com.gabrielvieira.demo.controller;

import com.gabrielvieira.demo.dto.LocalizacaoDto;
import com.gabrielvieira.demo.service.LocalizacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/localizacao")
public class LocalizacaoController {

    public LocalizacaoController() {
    }

    @Autowired
    private LocalizacaoService localizacaoService;

    @GetMapping("/todas")
    public List<LocalizacaoDto> getTodasLocalizacoes() {
        return localizacaoService.procurarLocalizacaoTodas();
    }

    @GetMapping("/{idLocalizacao}")
    public LocalizacaoDto getLocalizacaoId(@PathVariable(value = "idLocalizacao") Integer idLocalizacao) {
        return localizacaoService.procurarLocalizacaoId(idLocalizacao);
    }

    @GetMapping("/linha")
    public List<LocalizacaoDto> getLocalizacao(@RequestParam(value = "nome", required = false) String linha) {
        return localizacaoService.procurarLocalizacaoLinha(linha);
    }

    @GetMapping
    public LocalizacaoDto getLocalizacao(@RequestParam(value = "nome", required = false) String nomeLocalizacao,
                                         @RequestParam(value = "endereco", required = false) String endereco) {
        if (nomeLocalizacao != null) {
            return localizacaoService.procurarLocalizacaoNome(nomeLocalizacao);
        } else {
            return localizacaoService.procurarLocalizacaoEndereco(endereco);
        }
    }

    @PostMapping
    public LocalizacaoDto criarLocalizacao(@RequestBody LocalizacaoDto localizacaoDto) {
        return localizacaoService.criarLocalizacao(localizacaoDto);
    }

    @DeleteMapping("/{idLocalizacao}")
    public String deletarMaquina(@PathVariable Integer idLocalizacao) {
        return localizacaoService.deletarLocalizacao(idLocalizacao);
    }

    @PutMapping("/{idMaquina}")
    public LocalizacaoDto atualizarLocalizacao(@RequestBody LocalizacaoDto localizacaoDto) {
        return localizacaoService.atualizarLocalizacao(localizacaoDto);
    }
}
