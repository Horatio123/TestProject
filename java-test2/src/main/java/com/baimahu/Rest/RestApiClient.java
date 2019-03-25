package com.baimahu.Rest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

public class RestApiClient {
    public static void main(String[] args){
        Client client = ClientBuilder.newClient();
        Response response = client.target("http://localhost:8080/myresource").request().get();
        // Message message = response.readEntity(Message.class);
        System.out.println(response.readEntity(String.class));
    }
}
