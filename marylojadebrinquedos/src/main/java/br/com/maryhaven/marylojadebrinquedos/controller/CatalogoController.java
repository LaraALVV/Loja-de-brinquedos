package main.java.br.com.maryhaven.marylojadebrinquedos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CatalogoController {

    // Mapeia a rota /catalogo com um parâmetro categoria
    @GetMapping("/catalogo")
    public String catalogo(@RequestParam String categoria) {
        // Lógica para obter brinquedos da categoria e enviar para o template
        return "catalogo";
    }
}
