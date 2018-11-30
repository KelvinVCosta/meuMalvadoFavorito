package edu.servlet;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class PopulateDB {

    public static HttpResponse<String> getInfo() throws UnirestException {
        HttpResponse<String> req = Unirest.get("https://dadosabertos.camara.leg.br/api/v2/proposicoes?ordem=ASC&ordernarPor=id&siglaTipo=PL&ano=2018")
                .header("Cache-Control", "no-cache")
                .header("cache-control", "no-cache")
                .header("Postman-Token", "6deacdf0-f50f-4866-a73f-6d22234dc3cd")
                .asString();

        return req;
    }

    public static void main(String[] args){
        try{
            HttpResponse<String> response = getInfo();
            System.out.println(response.getBody());
        } catch (UnirestException ex){
            ex.printStackTrace();
        }
    }

}
