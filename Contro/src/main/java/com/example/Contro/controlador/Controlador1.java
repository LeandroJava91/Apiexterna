package com.example.Contro.controlador;

import com.example.Contro.modelo.ChuckNorrisJoke;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class Controlador1 {

    private final RestTemplate restTemplate;

    public Controlador1(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/data")
    public String getData(Model model) {
        String apiUrl = "https://api.chucknorris.io/jokes/random";
        ChuckNorrisJoke responseData = restTemplate.getForObject(apiUrl, ChuckNorrisJoke.class);
        model.addAttribute("responseData", responseData);
        return "dataPage"; // Renderiza la página Thymeleaf llamada "dataPage"
    }
}
