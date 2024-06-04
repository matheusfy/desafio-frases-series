package io.com.github.matheusfy.screenmatch_frases.service;

import io.com.github.matheusfy.screenmatch_frases.model.entity.Frase;
import io.com.github.matheusfy.screenmatch_frases.repository.FrasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FrasesService {

    @Autowired
    FrasesRepository repository;

    public Frase getRandomFrase(){
        Optional<Frase> frase = repository.buscaFraseAleatoria();
        return frase.orElse(null);
    }
}
