
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel Vieira
 */
public class Metodos {
    
         //Metodos Post VIDEOAULA

    public void sendPost(String url,String urlParameters ,String method) throws MalformedURLException, IOException{
         URL obj = new URL(url);
         HttpURLConnection con = (HttpURLConnection) obj.openConnection();
         con.setRequestMethod(method);
         con.setRequestProperty("Content-Type", "application/json");
         con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
         con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close(); 
        
        int responseCode = con.getResponseCode();
         System.out.println("\nSending 'POST' request to URL: " + url);
         System.out.println("Post parametres: " + urlParameters);
         System.out.println("Response Code: " + responseCode);
         
         BufferedReader in = new BufferedReader(
         
                 new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null){
                response.append(inputLine);
            }
            in.close();
            System.out.println(response.toString());
     }
}
