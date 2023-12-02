package main.java.br.com.maryhaven.marylojadebrinquedos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NovoBrinquedoController {

    @GetMapping("/novo-brinquedo")
    public String novoBrinquedo() {
        return "novoBrinquedo";
    }
}

