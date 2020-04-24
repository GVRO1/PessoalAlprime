package com.mycompany.conexaoservidor;

import com.google.gson.Gson;
import java.io.IOException;
import org.springframework.web.client.RestTemplate;
import com.mycompany.tabelas.Maquina;
import com.mycompany.tabelas.Localizacao;
import com.mycompany.tabelas.Registro;

public class ClienteApi {
//Metodos GET

    Metodos metodo = new Metodos();

    public Maquina getMaquina(String serial) {
        final String uri = String.format("http://localhost:8080/maquina/%s}", serial);
        RestTemplate restTemplate = new RestTemplate();
        Maquina maquina = restTemplate.getForObject(uri, Maquina.class);
        return maquina;
    }

    public Integer getTotalMaquina() {
        final String uri = String.format("http://localhost:8080/maquina/quantidade");
        RestTemplate restTemplate = new RestTemplate();
        Integer quantidade = restTemplate.getForObject(uri, Integer.class);
        return quantidade;
    }

    public Integer getTotalRegistro() {
        final String uri = String.format("http://localhost:8080/registro/quantidade");
        RestTemplate restTemplate = new RestTemplate();
        Integer quantidade = restTemplate.getForObject(uri, Integer.class);
        return quantidade;
    }

    public Maquina getMaquina(Integer idMaquina) {
        final String uri = String.format("http://localhost:8080/maquina/%d", idMaquina);
        RestTemplate restTemplate = new RestTemplate();
        String json = restTemplate.getForObject(uri, String.class);
        System.out.println(json);
        Gson g = new Gson();
        Maquina maquina = new Maquina();
        return maquina = g.fromJson(json, Maquina.class);
    }

    public Localizacao getLocalizacacao(Integer idLocalizacao) {
        final String uri = String.format("http://localhost:8080/localizacao/%d", idLocalizacao);
        RestTemplate restTemplate = new RestTemplate();
        String json = restTemplate.getForObject(uri, String.class);
        System.out.println(json);
        Gson g = new Gson();
        Localizacao localizacao = new Localizacao();
        if (json == null) {
            return localizacao;
        } else {
            return localizacao = g.fromJson(json, Localizacao.class);
        }
    }

    public Registro getRegistro(Integer idRegistro) {
        final String uri = String.format("http://localhost:8080/registro/%d", idRegistro);
        RestTemplate restTemplate = new RestTemplate();
        String json = restTemplate.getForObject(uri, String.class);
        System.out.println(json);
        Gson g = new Gson();
        Registro registro = new Registro();
        return registro = g.fromJson(json, Registro.class);
    }

    public void criarMaquina(Maquina maquina) throws IOException {
        Gson g = new Gson();
        String json = g.toJson(maquina);
        String url = "http://localhost:8080/maquina";
        metodo.sendPost(url, json, "POST");
    }

    public void atualizarMaquina(Integer idMaquina, Maquina maquina) throws IOException {
        Gson g = new Gson();
        String json = g.toJson(maquina);
        String url = String.format("http://localhost:8080/maquina/%d", idMaquina);
        metodo.sendPut(url, json, "PUT");
    }

    public void criarRegistro(Registro registro) throws IOException {
        Gson g = new Gson();
        String json = g.toJson(registro);
        String url = "http://localhost:8080/registro";
        metodo.sendPost(url, json, "POST");
    }

    public void criarLocalizacao(Localizacao localizacao) throws IOException {
        Gson g = new Gson();
        String json = g.toJson(localizacao);
        String url = "http://localhost:8080/localizacao";
        metodo.sendPost(url, json, "POST");
    }

}
