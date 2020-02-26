package com.anuj.utils;

import org.apache.logging.log4j.core.Logger;
import org.glassfish.jersey.client.ClientResponse;
import org.json.JSONObject;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import java.util.HashMap;

public class JerseyClientUtils {
        static Logger log = null;
    static ClientResponse post(String url, HashMap<Object, Object> header, JSONObject requestBody){
        ClientResponse clientResponse = null;
        Client client = ClientBuilder.newClient();
        log.info("Here");
        return clientResponse;


    }

}
