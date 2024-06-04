package io.com.github.matheusfy.screenmatch_frases.repository;

import io.com.github.matheusfy.screenmatch_frases.model.entity.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FrasesRepository extends JpaRepository<Frase, Long> {

    @Query(value = "select * from frases order by random() limit 1", nativeQuery = true)
    Optional<Frase> buscaFraseAleatoria();

}
