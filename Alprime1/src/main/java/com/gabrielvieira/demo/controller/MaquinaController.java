package com.gabrielvieira.demo.controller;

import com.gabrielvieira.demo.dto.MaquinaDto;
import com.gabrielvieira.demo.service.MaquinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/maquina")
public class MaquinaController {
    public MaquinaController() {
    }

    @Autowired
    private MaquinaService maquinaService;

    @GetMapping("/todas")
    public List<MaquinaDto> getTodasMaquinas() {
        return maquinaService.procurarMaquinaTodas();
    }

    @GetMapping("/{idMaquina}")
    public MaquinaDto getMaquina(@PathVariable(value = "idMaquina") Integer idMaquina) {
        return maquinaService.procurarMaquinaId(idMaquina);
    }

    @GetMapping
    public List<MaquinaDto> getMaquinasLocalizacao(@RequestParam(value = "nomeLocalizacao", required = false) String nomeLocalizacao) {
        return maquinaService.procurarMaquinaLocalizacao(nomeLocalizacao);
    }

    @PostMapping
    public MaquinaDto criarMaquina(@RequestBody MaquinaDto maquinaDto) {
        return maquinaService.criarMaquina(maquinaDto);
    }

    @DeleteMapping("/{idMaquina}")
    public String deletarMaquina(@PathVariable Integer idMaquina) {
        return maquinaService.deletarMaquina(idMaquina);
    }
    @PutMapping("/{idMaquina}")
    public MaquinaDto atualizarMaquina(@RequestBody MaquinaDto maquinaDto) {
        return maquinaService.atualizarMaquina(maquinaDto);
    }
}
