package com.example.pkg.executor;

import com.example.pkg.controller.trial02.MyData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpMethod;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriBuilder;

import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Trial002 {
    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("execute start.");
        new Trial002().execute();
        System.out.println("execute end.");
    }

    private void execute() throws JsonProcessingException {
        // execute logic here.
        var ret1 = requestImpl(HttpMethod.GET, MyData.class, URL, null);
        System.out.println(ret1);

        var ret2 = requestImpl(HttpMethod.GET, MyData.class, URLU, null);
        System.out.println(ret2);

        var ret3 = requestImpl(HttpMethod.GET, MyData.class, URLN, null);
        System.out.println(ret3);

    }

    private static final String URL = "http://localhost:8080/trial02";
    private static final String URLU = "http://localhost:8080/trial02u";
    private static final String URLN = "http://localhost:8080/trial02n";

    private <REQ, RES> List<RES> requestImpl(HttpMethod requestMethod, Class<RES> responseClass,
                                       String url, REQ requestBody) {
        WebClient webClient = WebClient.builder().build();
        var spec = webClient.method(requestMethod).uri(url)
                .retrieve()
                .bodyToFlux(responseClass)
                .collectList()
                .block();
        return spec;
    }
}
