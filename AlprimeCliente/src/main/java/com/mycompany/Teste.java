package com.mycompany;


import java.io.IOException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.test.context.junit4.SpringRunner;
import com.mycompany.tabelas.Maquina;
import com.mycompany.tabelas.Localizacao;
import com.mycompany.conexaoservidor.ClienteApi;

@RunWith(SpringRunner.class)
@SpringBootTest

public class Teste extends SpringBootServletInitializer {
 
    @Test
    public static void main(String[] args) throws IOException, InterruptedException {

        ClienteApi cliente = new ClienteApi();
        Localizacao localizacao = cliente.getLocalizacacao(1);
        Maquina maquina = new Maquina(localizacao);
        cliente.atualizarMaquina(1, maquina);
        
    }

}
