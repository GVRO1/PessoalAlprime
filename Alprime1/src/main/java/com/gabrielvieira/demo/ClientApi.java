package com.gabrielvieira.demo;

import com.gabrielvieira.demo.dto.MaquinaDto;
import com.gabrielvieira.demo.model.Localizacao;
import com.gabrielvieira.demo.model.Maquina;
import org.springframework.web.client.RestTemplate;

public class ClientApi {
//Metodos GET
    public void getMaquina(Integer idMaquina) {
        final String uri = "http://localhost:8080/maquina/1";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
    }

    public String getLocalizacacao(Integer idLocalizacao) {
        final String uri = "http://localhost:8080/localizacao/"+ idLocalizacao;
        RestTemplate restTemplate = new RestTemplate();
        System.out.println(restTemplate.getForObject(uri, String.class));
        return  restTemplate.getForObject(uri, String.class);

    }

    //Metodos POST

    public void criarMaquina(Maquina maquina)
    {
        final String uri = "http://localhost:8080/maquina";

        RestTemplate restTemplate = new RestTemplate();
        Maquina result = restTemplate.postForObject( uri, maquina, Maquina.class);

        System.out.println(result);
    }
}
