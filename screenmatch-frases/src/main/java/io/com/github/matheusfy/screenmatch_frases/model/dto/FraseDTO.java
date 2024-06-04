package io.com.github.matheusfy.screenmatch_frases.model.dto;

import io.com.github.matheusfy.screenmatch_frases.model.entity.Frase;

public record FraseDTO(
         String frase,
         String personagem,
         String titulo,
         String poster
) {
    public static FraseDTO fromFrase(Frase frase){
        return new FraseDTO(frase.getFrase(), frase.getPersonagem(), frase.getTitulo(), frase.getPoster());
    }
}
