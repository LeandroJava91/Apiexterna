package com.example.Contro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalAPIService {

    @Autowired
    private RestTemplate restTemplate;

    public String fetchDataFromExternalAPI() {
        String apiUrl = "https://api.chucknorris.io/jokes/random";
        return restTemplate.getForObject(apiUrl, String.class);
    }
}
