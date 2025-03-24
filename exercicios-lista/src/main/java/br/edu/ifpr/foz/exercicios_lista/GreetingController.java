package br.edu.ifpr.foz.exercicios_lista;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {
    @GetMapping("/")
    @ResponseBody
    public String greeting() {
        return "Olá mundo!";
    }
}
