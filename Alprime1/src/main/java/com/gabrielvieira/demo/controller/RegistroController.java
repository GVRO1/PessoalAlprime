package com.gabrielvieira.demo.controller;


import com.gabrielvieira.demo.dto.LocalizacaoDto;
import com.gabrielvieira.demo.dto.MaquinaDto;
import com.gabrielvieira.demo.dto.RegistroDto;
import com.gabrielvieira.demo.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/registro")
    public class RegistroController {

        public RegistroController() {
        }

        @Autowired
        private RegistroService registroService;

        @GetMapping("/todas")
        public List<RegistroDto> getTodasRegistro() {
            return registroService.procurarRegistroTodas();
        }

        @GetMapping("/maquina/{idMaquina}")
        public List<RegistroDto> getTodasRegistro(@PathVariable(value = "idMaquina") Integer idMaquina) {
            return registroService.procurarRegistroMaquinas(idMaquina);
        }

        @GetMapping("/{idRegistro}")
        public RegistroDto getRegistro(@PathVariable(value = "idRegistro") Integer idRegistro) {
            return registroService.procurarRegistroId(idRegistro);
        }
        @GetMapping("/data")
        public List<RegistroDto> getRegistro(@RequestParam(value = "comeco", required = false) String dataComeco,
                                            @RequestParam(value = "fim", required = false) String dataFinal) {
                return registroService.procurarRegistroData(dataComeco,dataFinal);
        }


        @PostMapping
        public RegistroDto criarRegistro(@RequestBody RegistroDto RegistroDto) {
            return registroService.criarRegistro(RegistroDto);
        }

        @DeleteMapping("/{idRegistro}")
        public String deletarRegistro(@PathVariable Integer idRegistro) {
            return registroService.deletarRegistro(idRegistro);
        }
        @PutMapping("/{idRegistro}")
        public RegistroDto atualizarRegistro(@RequestBody RegistroDto RegistroDto) {
            return registroService.atualizarRegistro(RegistroDto);
        }
    }
