
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.springframework.web.client.RestTemplate;

public class ClientApi {
//Metodos GET
        Metodos metodo = new Metodos();

    public Maquina getMaquina(Integer idMaquina) {
        
        final String uri = String.format("http://localhost:8080/maquina/%d",idMaquina);
        RestTemplate restTemplate = new RestTemplate();
        String json = restTemplate.getForObject(uri, String.class);
        System.out.println(json);
        Gson g = new Gson();
        Maquina maquina = new Maquina();

        return maquina = g.fromJson(json, Maquina.class);
    }

    public Localizacao getLocalizacacao(Integer idLocalizacao) {
        final String uri = String.format("http://localhost:8080/localizacao/%d",idLocalizacao);
        RestTemplate restTemplate = new RestTemplate();
        String json = restTemplate.getForObject(uri, String.class);
        System.out.println(json);
        Gson g = new Gson();
        Localizacao localizacao = new Localizacao();

        return localizacao = g.fromJson(json, Localizacao.class);
    }

     public Registro getRegistro(Integer idRegistro) {
        final String uri = String.format("http://localhost:8080/registro/%d",idRegistro);
        RestTemplate restTemplate = new RestTemplate();
        String json = restTemplate.getForObject(uri, String.class);
        System.out.println(json);
        Gson g = new Gson();
        Registro registro = new Registro();

        return registro = g.fromJson(json, Registro.class);
    }
     
    public void criarMaquina(Maquina maquina) throws IOException{
        Gson g = new Gson();
        String json = g.toJson(maquina);
        String url = "http://localhost:8080/maquina";
        metodo.sendPost(url, json, "POST");
    }
    
    public void criarRegistro(Registro registro) throws IOException{
        Gson g = new Gson();
        String json = g.toJson(registro);
        String url = "http://localhost:8080/registro";
        metodo.sendPost(url, json, "POST");
    }
    
    public void criarLocalizacao(Localizacao localizacao) throws IOException{
        Gson g = new Gson();
        String json = g.toJson(localizacao);
        String url = "http://localhost:8080/localizacao";
        metodo.sendPost(url, json, "POST");  
    }
     
     
     
     

}
