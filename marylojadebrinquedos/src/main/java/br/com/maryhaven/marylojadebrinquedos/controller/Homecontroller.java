package main.java.br.com.maryhaven.marylojadebrinquedos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Mapeia a raiz do aplicativo
    @GetMapping("/")
    public String home() {
        // Retorna o nome do template HTML (sem extensão)
        return "home";
    }
}