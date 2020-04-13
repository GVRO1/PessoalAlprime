package com.gabrielvieira.demo;

import com.gabrielvieira.demo.dto.LocalizacaoDto;
import com.gabrielvieira.demo.dto.MaquinaDto;
import com.gabrielvieira.demo.model.Localizacao;
import com.gabrielvieira.demo.model.Maquina;
import com.gabrielvieira.demo.model.Registro;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {
    //private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    //private Thread threadMonitoramento = new Thread(this::atualizarDados);
    //boolean play = true;

    //public void iniciarLeituras() {
    //  this.threadMonitoramento.start();
    //  }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        //  List<Registro> registros = new ArrayList<>();
        // ClientApi clientApi = new ClientApi();
        //MaquinaAtual maquinaAtual = new MaquinaAtual();
        //Double memoriaTotal = maquinaAtual.getMemoriaTotal();
        //String processadorTipo = maquinaAtual.getProceNome();
        //String sistemOperacional = maquinaAtual.getSistemaOperacional();
        //List<Maquina>maquinas = new ArrayList<>();
        //Localizacao localizacao = cid_localizacaolientApi.getLocalizacacao(1);
        // Maquina maquinaVm = new Maquina(20, processadorTipo, sistemOperacional, memoriaTotal,registros,localizacao);
        //clientApi.getMaquina(2);
        //clientApi.getLocalizacacao(1);
        // clientApi.criarMaquina(maquinaVm);
    }


    //public void atualizarDados() {


        //   while (play) {
        //     System.out.println("================================================");
        //   System.out.println(String.format("Memoria Restante: %.2f %%", memoria.getMemoRestante()));
        // System.out.println(String.format("Memoria Utilizada: %.2f %%", memoria.getMemoUtilizada()));
        //System.out.println(String.format("Faltam: %.2f %%", bateria.getBatRestante() * 100));
        //System.out.println(String.format("Esta carregando: %b", bateria.getBatRestante()));
        // try {
        //    Thread.sleep(1000);
        //} catch (InterruptedException e) {

        //}
        //}

    }
//}
//


