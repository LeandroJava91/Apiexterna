package com.example.Contro.controlador;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Controlador {

    @GetMapping("/hello")
    public String helloWorld() {
        return "hello"; // Nombre del archivo JSP
    }



}
