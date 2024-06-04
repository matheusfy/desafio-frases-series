package io.com.github.matheusfy.screenmatch_frases.controller;


import io.com.github.matheusfy.screenmatch_frases.model.dto.FraseDTO;
import io.com.github.matheusfy.screenmatch_frases.model.entity.Frase;
import io.com.github.matheusfy.screenmatch_frases.service.FrasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static io.com.github.matheusfy.screenmatch_frases.model.dto.FraseDTO.fromFrase;

@RestController
@RequestMapping("/")
public class FrasesController {

    @Autowired
    FrasesService service;

    @GetMapping("/series/frases")
    public FraseDTO  getFrase(){
        Frase frase = service.getRandomFrase();
        return fromFrase(frase);
    }
}
