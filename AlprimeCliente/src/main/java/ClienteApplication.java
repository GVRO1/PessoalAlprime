
import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@RunWith(SpringRunner.class)
@SpringBootTest

public class ClienteApplication extends SpringBootServletInitializer {
 
    @Test
    public static void main(String[] args) throws IOException {
//        ClientApi cliente = new ClientApi();
//        Maquina maquina = cliente.getMaquina(1);
//        cliente.getLocalizacacao(1);
//        cliente.getRegistro(1);
//        Maquina maquina1 = new Maquina(2,"ab","bc",2.0,1,null);
//        cliente.criarMaquina(maquina1);
//        System.out.println(maquina1);

//        for(int i=0;i<2;i++){
//        Registro registro = new Registro(1,"08:09",2,0,13,maquina);
//        cliente.criarRegistro(registro);
//        }
//    List<Maquina> maquinas = new ArrayList();
//    Localizacao loc = new Localizacao(2,"teste","teste","teste",maquinas);
//    cliente.criarLocalizacao(loc);
        
    }

}
