package br.com.alura.demo.controller;

import br.com.alura.demo.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @GetMapping("/topicos")
    @ResponseBody
    public List<Topico> lista() {
        Categoria categoria = new Categoria("Programacao");
        Perfil perfis = new Perfil("joao");
        Subcategoria subcategoria = new Subcategoria("Backend", categoria);
        Curso curso = new Curso("Spring", subcategoria);
        List<Perfil> perfisList = new ArrayList<>();
        perfisList.add(perfis);
        Usuario dono = new Usuario("Joao Machado", "jvbm2177@gmail.com", "123123", perfisList);
        Topico topico = new Topico("Duvida", "Duvida com Spring Boot e Maven", curso, dono);

        return Arrays.asList(topico, topico, topico);
    }
}
